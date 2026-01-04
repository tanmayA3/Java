import java.util.Scanner;
import static java.lang.Math.*;
public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter side lengths of trinagle: ");
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        float semi=(a+b+c)/2;
        double area=sqrt(semi*(semi-a)*(semi-b)*(semi-c));
        System.out.print("Area of triangle is: "+area);
    }
}
