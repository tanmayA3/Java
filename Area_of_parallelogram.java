import java.util.Scanner;
import static java.lang.Math.*;
public class Area_of_parallelogram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter sides and angles in rad. b/w sides respectively: ");
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        double height=b*sin(c);
        System.out.println("Area of paralleogram is: "+height*a);
    }
}