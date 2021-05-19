package config;

public class DBConnectionInfo_EagerInitialization {

	/**
	 * 1. Eager Initialization
	 */
	private static DBConnectionInfo_EagerInitialization DBConnectionInfoInstance = new DBConnectionInfo_EagerInitialization();

	private DBConnectionInfo_EagerInitialization() {}

	public static DBConnectionInfo_EagerInitialization getInstance() {
		return DBConnectionInfoInstance;
	}

	private String url = "";
	private String encoding = "";
	private String maxActive = "";
	private String maxIdle = "";
	private String minIdle = "";

	// getter와 setter 생략

}
