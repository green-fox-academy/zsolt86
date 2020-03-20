import java.util.Scanner;

public class DivideByZero {

    /* Create a function that takes a number
    divides ten with it,
    and prints the result.
    It should print "fail" if the parameter is 0 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a divisor: ");
        double divisor = sc.nextDouble();

        DivideFunction(divisor);

    }

    public static void DivideFunction (double divisor) {

        try {
            double result = 10 / divisor;
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY)
                throw new  ArithmeticException();

            System.out.println("10 / " + divisor + " = " + result);

        } catch (ArithmeticException divideBy0) {
            System.out.println("Fail, you can't divide by 0..");
        }

    }

}