import java.util.Scanner;
public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0, b=1, c;
        System.out.println("Enter no. of terms in sequence: ");
        int n=in.nextInt();
        System.out.println(a+"\n"+b);
        for (int i=1;i<=n-2;i+=1) {
            c=b;
            b+=a;
            a=c;
            System.out.println(b);
        }
    }
}
