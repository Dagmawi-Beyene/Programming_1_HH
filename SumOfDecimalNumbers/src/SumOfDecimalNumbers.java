import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class SumOfDecimalNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);
		
		System.out.printf("Enter first number: ");
		BigDecimal first = input.nextBigDecimal();

		System.out.printf("Enter second number: ");
		BigDecimal second = input.nextBigDecimal();

		BigDecimal sum = first.add(second);

		System.out.print("The sum is " + sum);

	}

}