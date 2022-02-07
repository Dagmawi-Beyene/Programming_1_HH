
import java.util.Scanner;

public class ValidateMonthAgain {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        String grade = "";
        int gradeToInt = 0;
        boolean valid = false;

        do {
            try {
                System.out.print("Enter a month number: ");
                grade = input.nextLine();
                gradeToInt = Integer.parseInt(grade);
                if (gradeToInt >= 1 && gradeToInt <= 12) {
                    valid = true;
                    System.out.print("OK");
                } else {
                    System.out.print(grade + " is not a valid month number.\n");
                }
            } catch (Exception e) {
                System.out.print(grade + " is not a valid month number.\n");
            }
        }
        while (valid == false);

    }
}