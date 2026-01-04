import java.util.Scanner;

public class ar_peri_of_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius: ");
        int a = in.nextInt();
        ar_peri(a);
    }

    static void ar_peri(int a) {
        double peri = 2 * 3.14 * a;
        double area = 3.14 * a * a;
        System.out.println("Perimeter is: " + peri);
        System.out.println("Area is: " + area);
    }
}
