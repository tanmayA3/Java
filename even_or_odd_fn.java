import java.util.Scanner;

public class even_or_odd_fn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = in.nextInt();
        System.out.println("Number is: " + even_odd(a));
    }

    static String even_odd(int a) {
        if (a % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
