import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=in.nextInt();
        int i=1;
        int c=1;
        if (n!=0) {
            while (i<=n) {
                c=c*i;
                i++;
            }
        System.out.print("Factorial of "+n+" is: "+c);
        }
        else if (n==0) 
            System.out.print("Factorial of 0 is: 1");
        else
            System.out.print("Factorial of -ve number is not defined");
    }
}