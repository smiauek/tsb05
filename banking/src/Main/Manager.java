package Main;

public class Manager extends Employee {

	// fields
	private String timeCards;

	// constructors
	public Manager() {
		
	}
	
	public Manager(String firstName, String lastName, String jobTitle, long empl_id, String timeCards) {
		super(firstName, lastName, jobTitle, empl_id);
		
		this.timeCards = timeCards;
	}

	// getters and setters
	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	// other methods
	@Override
	public String toString() {
		return "Manager [timeCards= " + timeCards + ", FirstName= " + getFirstName() + ", LastName= "
				+ getLastName() + ", JobTitle= " + getJobTitle() + ", Empl_id= " + getEmpl_id() + "]";
	}
	
	
	public void PrintThis(int ...val ) {
		for (int i : val) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
}
