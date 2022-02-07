import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter interest rate: ");
        double interestRate = readDouble(input);
		
		System.out.print("Enter capital income tax rate: ");
        double incomeTaxRate = readDouble(input);
		
        System.out.print("Enter initial deposit: ");
        double initialDeposit = readDouble(input);

        System.out.print("Enter number of years: ");
        int numberOfYears = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= numberOfYears; i++) {
            double interest = initialDeposit * interestRate / 100;
            double tax = interest * incomeTaxRate / 100;
            double yearTotal = initialDeposit + interest - tax;
            initialDeposit = yearTotal;
            System.out.println(i + ": " + twoDecimals.format(yearTotal));
        }
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}