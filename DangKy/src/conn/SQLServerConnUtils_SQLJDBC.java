package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_SQLJDBC {
	public static Connection getSQLServerConnection_SQLJDBC() //
			throws ClassNotFoundException, SQLException {

		// Chú ý: Thay đổi các thông số kết nối cho phù hợp.
		String hostName = "localhost";
		// String sqlInstanceName = "SQLEXPRESS";
		String database = "RegisterDB";
		String userName = "sa";
		String password = "sapassword";

		return getSQLServerConnection_SQLJDBC(hostName, database, userName, password);
	}

	// Kết nối tới SQLServer, sử dụng thư viện SQLJDBC.
	private static Connection getSQLServerConnection_SQLJDBC(String hostName, String sqlInstanceName, String database,
			String userName, String password) throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Cấu trúc URL Connection dành cho SQLServer
		// Ví dụ:
		// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
				+ ";instance=" + sqlInstanceName + ";databaseName=" + database;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

	private static Connection getSQLServerConnection_SQLJDBC(String hostName, String database, String userName,
			String password)//
			throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Cấu trúc URL Connection dành cho SQLServer
		// Ví dụ:
		// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
				+ ";databaseName=" + database;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

}
