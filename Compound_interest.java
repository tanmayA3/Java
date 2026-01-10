import java.util.Scanner;
public class Compound_interest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        float a=in.nextFloat();
        System.out.print("Enter rate: ");
        float b=in.nextFloat();
        System.out.print("Enter time in years: ");
        int c=in.nextInt();
        System.out.print("Enter compunding frequency: ");
        int d=in.nextInt();
        double i=a*Math.pow(1+(b/(100*d)),c*d);
        System.out.print("The final amount is: "+i);
    }
}