import java.util.Scanner;

public class GreetingProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstname = input.nextLine();
		System.out.print("Enter your last name: ");
		String lastname = input.nextLine();

		System.out.println();
		System.out.println("Hello " + firstname + " " + lastname +  "!");

		input.close();
	}

}