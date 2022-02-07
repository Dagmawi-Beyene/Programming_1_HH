public class MethodsFactorials {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    private static int factorial(int a) {
        int factorialOfInput = 1;
        for (int i = 1; i <= a; i++) {
            factorialOfInput = factorialOfInput * i;
        }
        return factorialOfInput;
    }
}