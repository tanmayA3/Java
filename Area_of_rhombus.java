import java.util.Scanner;
import static java.lang.Math.*;
public class Area_of_rhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter side and angle(in rad) between sides of rhombus respectively: ");
        float s=in.nextFloat();
        float a=in.nextFloat();
        System.out.print("The area of rhombus is: "+pow(s,2)*sin(a));
        }
}