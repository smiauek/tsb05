package connectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	
	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet resultSet = null;
	
	public EmployeeDAO() {
		
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn;
		conn = FactoryConnection.getInstance().getConnection();
		return conn;		
	}
	
	public EmployeeModel getEmployeeById(int id) {
		EmployeeModel employee = new EmployeeModel();
		
		try {
		String queryString = "SELECT * FROM employees";
		connection = getConnection();
		ps = connection.prepareStatement(queryString);
		
		resultSet = ps.executeQuery();
		
		while (resultSet.next()) {
			System.out.println("Employee number: " + resultSet.getInt("employeeNumber") + 
								", First Name: " + resultSet.getString("firstName") + 
								", Last name: " + resultSet.getString("lastName") + 
								", Job title: " + resultSet.getString("jobTitle"));
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	public EmployeeModel insertEmployee(int id) {
		EmployeeModel employee = new EmployeeModel();
		
		try {
		String queryString = "SELECT * FROM employees";
		connection = getConnection();
		ps = connection.prepareStatement(queryString);
		
		resultSet = ps.executeQuery();
		
		while (resultSet.next()) {
			System.out.println("Employee number: " + resultSet.getInt("employeeNumber") + 
								", First Name: " + resultSet.getString("firstName") + 
								", Last name: " + resultSet.getString("lastName") + 
								", Job title: " + resultSet.getString("jobTitle"));
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	
	
}
