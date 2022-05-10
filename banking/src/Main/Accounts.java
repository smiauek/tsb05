package Main;

enum AccountTypes {
	CHECKING, SAVINGS, CREDIT
}

public class Accounts {

	AccountTypes accountTypes;

	public Accounts(AccountTypes accountTypes) {
		super();
		this.accountTypes = accountTypes;
	}

	public void chooseAccounts() {

		switch (accountTypes) {

		case CHECKING:
			System.out.println("You chose Checking");
			break;

		case SAVINGS:
			System.out.println("You chose Savings");
			break;

		case CREDIT:
			System.out.println("You chose Credit");
			break;
		}
		
		
		
		

	}

}
