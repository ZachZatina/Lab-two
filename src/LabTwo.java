import java.util.Scanner;

/*
 * Zachariah Zatina
 * 
 * A program to test if a digit entered and its odd/even or
 * if it falls in a range.
 * 
 */
public class LabTwo {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int input;
		char userChar = 'y';
		String userName;
		
		System.out.print("Hello! What is your name?: ");
		userName = scnr.nextLine();
		
		while (userChar == 'y') {
			System.out.print("Hello, " + userName + ", please enter a number between 1 and 100: ");
			while (!scnr.hasNextInt()) scnr.next();
			input = scnr.nextInt();
			
			if (input < 1 || input > 100) {
				System.out.println("This is not a valid number, try again.");
			}
			else {
				if (input % 2 == 0) {
					if(input < 25) {
						System.out.println(userName + " your number is even and less than 25.");
					}
					else if (input >= 26 && input <= 60) {
						System.out.println(userName + " your number is even");
					}
					else {
						System.out.println(userName + ", your number of " + input + " is even.");
					}
				}
				else {
					if(input > 60) {
						System.out.println(userName + ", your number of " + input + " is odd and over 60");
					}
					else {
						System.out.println(userName + ", your number of " + input + " is Odd");
					}
				}
			}
			
			System.out.print("Would you like to continue " + userName + "? (y/n): ");
			userChar = scnr.next().charAt(0);
			System.out.println("");
		}
		System.out.println("Thank you for using this application, " + userName + ". Goodbye!");
		scnr.close();
	}

}
