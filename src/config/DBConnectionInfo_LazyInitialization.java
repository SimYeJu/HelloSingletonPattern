package config;

public class DBConnectionInfo_LazyInitialization {

	/**
	 * 2. Lazy Initialization
	 */
	private static DBConnectionInfo_LazyInitialization DBConnectionInfoInstance;

	private DBConnectionInfo_LazyInitialization() {}

	public static DBConnectionInfo_LazyInitialization getInstance() {
		if(DBConnectionInfoInstance == null) {
			return DBConnectionInfoInstance = new DBConnectionInfo_LazyInitialization();
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
