import java.util.Scanner;

public class factorial_fn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        int b = factorial(a);
        if (b != -1)
            System.out.println("Factorial is: " + b);
        else
            System.out.println("Factorial for -ve number is not defined");
    }

    static int factorial(int a) {
        int c = 1;
        if (a > 0)
            return a * factorial(a - 1);
        else if (a == 0)
            return c;
        else
            return -1;
    }
}
