import java.util.Scanner;

public class ValidateInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Enter an integer: ");
			int grade = Integer.parseInt(input.nextLine());
			System.out.println("OK");
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer.");
		}

		input.close();
	}

}