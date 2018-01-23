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
		
		//Variable list
		Scanner scnr = new Scanner(System.in);
		int input;
		char userChar = 'y';
		String userName;
		
		//Getting the users name to make prgram more personable.
		System.out.print("Hello! What is your name?: ");
		userName = scnr.nextLine();
		
		//set up for loop to make app keep going as long as user wants.
		while (userChar == 'y') {
			//getting user input of number they want to test.
			System.out.print("Hello, " + userName + ", please enter a number between 1 and 100: ");
			//used to make sure value entered is a valid int (is there any way to make this have an output if it is a char or string?)
			while (!scnr.hasNextInt()) scnr.next();
			input = scnr.nextInt();
			
			//validation to make sure the user enters a number between 1 and 100
			if (input < 1 || input > 100) {
				System.out.println("This is not a valid number, try again.");
			}
			else {
				//Tests for even numbers
				if (input % 2 == 0) {
					//checks for even numbers that are less than 25
					if(input < 25) {
						System.out.println(userName + " your number is even and less than 25.");
					}
					//checks for even numbers between 26 and 60
					else if (input >= 26 && input <= 60) {
						System.out.println(userName + " your number is even");
					}
					//accounts for the rest of the even numbers
					else {
						System.out.println(userName + ", your number of " + input + " is even.");
					}
				}
				//Because all even numbers were checked all that can be left are odd
				else {
					//checks for odd numbers that are greater than 60
					if(input > 60) {
						System.out.println(userName + ", your number of " + input + " is odd and over 60");
					}
					else {
						System.out.println(userName + ", your number of " + input + " is Odd");
					}
				}
			}
			//This is what allows the user to loop the program again.
			System.out.print("Would you like to continue " + userName + "? (y/n): ");
			userChar = scnr.next().charAt(0);
			System.out.println("");
		}
		//ending statement of the program.
		System.out.println("Thank you for using this application, " + userName + ". Goodbye!");
		scnr.close();
	}

}
