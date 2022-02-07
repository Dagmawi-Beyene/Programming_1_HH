import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThree {

	public static void main(String[] args) {
		
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your gross wage: ");
		double grossSalary = readDouble(input);

		System.out.print("Enter the income tax rate: ");
		double incomeTax = readDouble(input);
		
		double sum = calculateNetWage(grossSalary, incomeTax);
		
		System.out.println("");
		System.out.println("Your net wage is " + twoDecimals.format(sum));
		
		input.close();
		
	}

	private static double calculateNetWage(double salary, double tax) {
		return (1 - (tax / 100)) * salary;
		}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
