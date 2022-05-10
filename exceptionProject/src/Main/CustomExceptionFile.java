package Main;

public class CustomExceptionFile extends Exception{
	
	private double amount;
	
	public CustomExceptionFile(String message, double amount) {
		super(message);
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

}
