package config;

public class DBConnectionInfo_LazyInitialization_synchronized {
	
	/**
	 * 3. Lazy Initialization + Syncronized
	 */
	private static DBConnectionInfo_LazyInitialization_synchronized DBConnectionInfoInstance;

	private DBConnectionInfo_LazyInitialization_synchronized() {}

	public static synchronized DBConnectionInfo_LazyInitialization_synchronized getInstance() {
		if(DBConnectionInfoInstance == null) {
			return DBConnectionInfoInstance = new DBConnectionInfo_LazyInitialization_synchronized();
		}
		return DBConnectionInfoInstance;
	}

	private String url = "";
	private String encoding = "";
	private String maxActive = "";
	private String maxIdle = "";
	private String minIdle = "";
	
	// getter와 setter 생략

}
