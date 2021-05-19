package config;

public class DBConnectionInfo_LazyInitialization_Holder {

	/**
	 * 5. Lazy Initialization + holder
	 */
	private DBConnectionInfo_LazyInitialization_Holder() {}

	public static DBConnectionInfo_LazyInitialization_Holder getInstance() {
		return Holder.instance;
	}
	
	private static class Holder {
		private static final DBConnectionInfo_LazyInitialization_Holder instance = new DBConnectionInfo_LazyInitialization_Holder();
	}

	private String url = "";
	private String encoding = "";
	private String maxActive = "";
	private String maxIdle = "";
	private String minIdle = "";
	
	// getter와 setter 생략

}
