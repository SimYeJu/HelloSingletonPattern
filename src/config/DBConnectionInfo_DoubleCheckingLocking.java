package config;

import java.util.Objects;

public class DBConnectionInfo_DoubleCheckingLocking {
	
	/**
	 * 4. Double checking Locking
	 */
	private static DBConnectionInfo_DoubleCheckingLocking DBConnectionInfoInstance;

	private DBConnectionInfo_DoubleCheckingLocking() {}

	public static DBConnectionInfo_DoubleCheckingLocking getInstance() {
		if (DBConnectionInfoInstance == null) {
			synchronized (DBConnectionInfo_DoubleCheckingLocking.class) {
				if (Objects.isNull(DBConnectionInfoInstance))
					return DBConnectionInfoInstance = new DBConnectionInfo_DoubleCheckingLocking();
			}
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
