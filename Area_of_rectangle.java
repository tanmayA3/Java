import java.util.Scanner;
public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        float a=in.nextFloat();
        float b=in.nextFloat();
        System.out.println("The area of rectangle is: "+a*b);
    }
}