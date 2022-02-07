import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int length = 0;
		String longbe = "";

		System.out.print("Enter first string: ");
		String aString = input.nextLine();

		if (aString.equals("quit")) {

			System.out.println("Bye!");

		} else {

			do {
				length += aString.length();
				System.out.print("Enter next string: ");
				aString = input.nextLine();
				if(aString.length() > longbe.length()){
					longbe = aString;
				}

			} while ("quit".equals(aString));

			System.out.println("");
			System.out.println("The longest string is '" + longbe + "' ");

		}

		input.close();
	}

}