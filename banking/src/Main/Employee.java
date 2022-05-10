package Main;

public class Employee extends AbstractAccountActions {

	// fields
	private String firstName;
	private String lastName;
	private String jobTitle;
	private long empl_id;
	private int totalAmount;

	// constructors
	public Employee() {

	}

	public Employee(String firstName, String lastName, String jobTitle, long empl_id) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.empl_id = empl_id;
	}

	public Employee(String firstName, String lastName, long empl_id) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public long getEmpl_id() {
		return empl_id;
	}

	public void setEmpl_id(long empl_id) {
		this.empl_id = empl_id;
	}

	// other methods
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ (jobTitle != null ? (", jobTitle=" + jobTitle) : "") + ", empl_id=" + empl_id + "]";
	}

	@Override
	float withdraw(int amount, int withdrawAmount) {
		totalAmount = amount - withdrawAmount;
		return totalAmount;
	}

	@Override
	float deposit(int amount, int depositAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
