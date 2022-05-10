package Main;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Jim", "Something", "Customer Service", 003);
		Employee emp2 = new Employee("John", "Doe", "Sales", 002);
		Employee emp3 = new Employee("John", "Doe", 002);


		Manager mngr1 = new Manager("Peter", "Smialkowski", "VP", 001, "blabla");
		
		mngr1.PrintThis(1, 2, 3, 4, 5, 6);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(mngr1);
		
		
		Box<Integer> intBox =new Box<Integer>(); 
		intBox.add(234);
		intBox.add(12);
		intBox.add(369);
		
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		
		strBox.add("Hello");
		strBox.add("Something");
		
		System.out.println(strBox.get());
		
		String str = "CHECKING";
		Accounts acc1 = new Accounts(AccountTypes.valueOf(str));
		
		acc1.chooseAccounts();
	

	}

}
