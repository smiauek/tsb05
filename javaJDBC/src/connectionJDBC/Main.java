package connectionJDBC;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDAO employees = new EmployeeDAO();
		
		EmployeeModel employeesModel = new EmployeeModel();				
		
		System.out.println(employees.getEmployeeById(1));

	}

}
