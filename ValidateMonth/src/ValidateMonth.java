import java.util.Scanner;

public class ValidateMonth {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter a month number: ");
			int grade = Integer.parseInt(input.nextLine());

			if (grade >= 1 && grade <= 12) {

				System.out.println("OK");

			}

			else {

				System.out.println("Please enter an integer between 1 and 12");
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer between 1 and 12");
		}

		input.close();
	}

}