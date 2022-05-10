package project2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int num = 12;
		int otherNum = 7;

		boolean isEven = num % 2 == 0;

		if (num > otherNum) {
			System.out.println("yes");
		}

		int age = 12;

		if (age < 18) {
			System.out.println("You're too young");
		} else {
			System.out.println("Wooooho!");
		}

		// =======================================================

//		Scanner userIntput = new Scanner(System.in);
//		
//		System.out.println("Hi, what's your name?");
//		String firstName = userIntput.nextLine();
//		
//		System.out.println("What is your age?");
//		int userAge = userIntput.nextInt();
//		
//		if (userAge > 17) {
//			System.out.println(firstName + ", You may pass");
//		} else {
//			System.out.println("You're too young!");
//		}
//		
//		userIntput.close();

		// =============================================================

		int day = 4;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		// Outputs "Thursday" (day 4)

		
		
		
		
		
	}

}
