import java.util.Scanner;

public class DescendingIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = Integer.parseInt(input.nextLine());

        for (int i = userInput; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}