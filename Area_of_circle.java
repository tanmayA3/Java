import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float a=in.nextFloat();
        double area=3.14*(a*a);
        System.out.print("Area of circle is: "+area);
    }
}