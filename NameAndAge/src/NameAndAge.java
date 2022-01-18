import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = Integer.parseInt(input.nextLine());

		System.out.print("Enter first name: ");
		String name = input.nextLine();

		System.out.println();
		System.out.println(name + "is " + age + " years of age");

		input.close();
	}
}