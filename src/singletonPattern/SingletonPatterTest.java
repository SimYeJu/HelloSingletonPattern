package singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import config.DBConnectionInfo_DoubleCheckingLocking;
import config.DBConnectionInfo_EagerInitialization;
import config.DBConnectionInfo_LazyInitialization;
import config.DBConnectionInfo_LazyInitialization_Holder;
import config.DBConnectionInfo_LazyInitialization_synchronized;

public class SingletonPatterTest {

	public static void main(String[] args) {
		
		/* Eager Initialization Test */
		System.out.println("Eager Initialization Test");
		runExecutorService_EagerInitialization();

		/* Lazy Initialization Test */
		System.out.println("Lazy Initialization Test");
		runExecutorService_LazyInitialization();

		/* Lazy Initialization + synchronized Test */
		System.out.println("Lazy Initialization + synchronized Test");
		runExecutorService_LazyInitialization_synchronized();
		
		/* Double Checking Locking Test */
		System.out.println("Double Checking Locking Test");
		runExecutorService_DoubleCheckingLocking();
		
		/* Lazy Initialization + Holder Test */
		System.out.println("Lazy Initialization + Holder Test");
		runExecutorService_LazyInitialization_Holder();
		
	}

	private static void runExecutorService_EagerInitialization() {
		
		ExecutorService exe = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			exe.execute(() -> {
				DBConnectionInfo_EagerInitialization instance = DBConnectionInfo_EagerInitialization.getInstance();
				System.out.println(instance.toString());
			});
		}
		
		exe.shutdown();
	}
	
	private static void runExecutorService_LazyInitialization() {
		
		ExecutorService exe = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			exe.execute(() -> {
				DBConnectionInfo_LazyInitialization instance = DBConnectionInfo_LazyInitialization.getInstance();
				System.out.println(instance.toString());
			});
		}
		
		exe.shutdown();
	}
	
	private static void runExecutorService_LazyInitialization_synchronized() {
		
		ExecutorService exe = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			exe.execute(() -> {
				DBConnectionInfo_LazyInitialization_synchronized instance = DBConnectionInfo_LazyInitialization_synchronized.getInstance();
				System.out.println(instance.toString());
			});
		}
		
		exe.shutdown();
	}
	
	private static void runExecutorService_DoubleCheckingLocking() {
		
		ExecutorService exe = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			exe.execute(() -> {
				DBConnectionInfo_DoubleCheckingLocking instance = DBConnectionInfo_DoubleCheckingLocking.getInstance();
				System.out.println(instance.toString());
			});
		}
		
		exe.shutdown();
	}
	
	private static void runExecutorService_LazyInitialization_Holder() {
		
		ExecutorService exe = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			exe.execute(() -> {
				DBConnectionInfo_LazyInitialization_Holder instance = DBConnectionInfo_LazyInitialization_Holder.getInstance();
				System.out.println(instance.toString());
			});
		}
		
		exe.shutdown();
	}

}
