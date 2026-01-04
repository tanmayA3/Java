import java.util.Scanner;
import static java.lang.Math.*;
public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int x=in.nextInt(),i=0,sum=0,j,y=x,o=x;
        while (y>0) {
            y=y/10;
            i++;
        }
        for (j=1;j<=i;j++) {
            sum+=pow((x%10),i);
            x=x/10;
        }
        if (sum==o) {
            System.out.print("The number is armstrong");
        }
        else {
            System.out.print("The number is not armstrong");
        }
    }
}