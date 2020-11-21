package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionUtil {

	/*public static Connection getConnection() {
		Connection conn = null;
		
		String url ="jdbc:sqlserver://localhost:1433;databaseName=RegisterDB";
		
		String user="sa";
		
		String password="sapassword";
		try {
			DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
		return conn;
	}*/
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		return SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
	}
	
	public static void closeQuitetly(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
