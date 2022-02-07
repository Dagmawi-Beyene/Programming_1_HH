
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.0");

		System.out.print("Enter the number of values: ");
		int number = Integer.parseInt(input.nextLine());
		if (number < 3) {
			System.out.println("Sorry, at least 3 values required");
		} else {
			int[] values = new int[number];

			String sampleData = new String();

			for (int i = 0; i < values.length; i++) {
				System.out.print("Enter an integer: ");
				values[i] = Integer.parseInt(input.nextLine());
				sampleData += values[i] + " ";
			}

			System.out.println("\nn = " + values.length);
			System.out.println("Min: " + ArrayStatLibrary.min(values));
			System.out.println("Max: " + ArrayStatLibrary.max(values));
			System.out.println("Median: " + twoDecimals.format(ArrayStatLibrary.median(values)));
			System.out.println("Mean: " + twoDecimals.format(ArrayStatLibrary.mean(values)));
			System.out.println(
					"Sample standard deviation: " + twoDecimals.format(ArrayStatLibrary.standardDeviation(values)));
			System.out.print("Sample data: " + sampleData.trim());

			input.close();
		}
	}
}
class ArrayStatLibrary {

	public static int max(int array[]) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int array[]) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static double median(int array[]) {

		Arrays.sort(array);

		int leng = array.length;
		double median = 0;

		if ((leng % 2) != 0) {
			median = array[(leng - 1) / 2];
		} else {
			median = (array[leng / 2] + array[(leng / 2) - 1]) / 2 + 0.5;
		}

		return median;
	}

	public static double mean(int array[]) {

		double mean = 0;

		for (int i = 0; i < array.length; i++) {
			mean += array[i];
		}
		mean = mean / array.length;
		return mean;
	}

	public static double standardDeviation(int array[]) {

		double mean = ArrayStatLibrary.mean(array);
		double numerator = 0;
		double denominator = array.length - 1;
		double fraction = 0;
		double deviation = 0;

		for (int i = 0; i < array.length; i++) {
			double a = (array[i] - mean) * (array[i] - mean);
			numerator += a;
		}

		fraction = numerator / denominator;
		deviation = Math.sqrt(fraction);

		return deviation;
	}

}