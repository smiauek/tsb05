package connectionJDBC;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
	
	//private final String driverClassName = ("com.mariadb.jdbc.Driver");
	private final String driverClassName = ("com.mysql.cj.jdbc.Driver");
	
	private final String url = "jdbc:mysql://localhost/classicmodels";
	//private final String url = "jdbc:mariadb://newDB/classicmodels";
	private final String user = "root";
	private final String pass = "pass";
	
	private static FactoryConnection factoryConnection = null;
	
	private FactoryConnection() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
		
	}
	
	public static FactoryConnection getInstance() {
		if (factoryConnection == null) {
			factoryConnection = new FactoryConnection();
		}
		return factoryConnection;
	}

}
