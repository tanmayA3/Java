import java.util.Scanner;
import static java.lang.Math.*;
public class Distance_between_two_points {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.println("Enter initial coordinates: ");
        x1=in.nextInt();
        y1=in.nextInt();
        System.out.println("Enter final coordinates: ");
        x2=in.nextInt();
        y2=in.nextInt();
        double d=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
        System.out.println("The distance is: "+d);
    }
}