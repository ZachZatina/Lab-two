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
		
		while (userChar == 'y') {
			System.out.print("Enter a number between 1 and 100: ");
			input = scnr.nextInt();
			
			if (input < 1 || input > 100) {
				System.out.println("This is not a valid number, try again");
			}
			else {
				if (input % 2 == 0) {
					if(input < 25) {
						System.out.println("Even and less than 25.");
					}
					else if (input >= 26 && input <= 60) {
						System.out.println("Even");
					}
					else {
						System.out.println(input + " Even.");
					}
				}
				else {
					if(input > 60) {
						System.out.println(input + " and Odd and over 60");
					}
					else {
						System.out.println(input + " is Odd");
					}
				}
			}
			
			System.out.print("Would you like to continue? (y/n): ");
			userChar = scnr.next().charAt(0);
			System.out.println("");
		}
		scnr.close();
	}

}
