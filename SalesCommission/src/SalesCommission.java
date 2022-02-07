import java.util.Scanner;
import java.text.DecimalFormat;

public class SalesCommission {

	public static void main(String[] args) {

		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the car's selling price: ");
		double sellingPrice = readDouble(input);

		System.out.println();

		if (sellingPrice * 0.014 < 300.00) {
			System.out.println("The sales commission is 300,00 euros.");
		} else {

			System.out.println("The sales commission is " + twoDecimals.format(sellingPrice * 0.014) + " euros.");
		}
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}