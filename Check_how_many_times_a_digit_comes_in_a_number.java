import java.util.Scanner;
public class Check_how_many_times_a_digit_comes_in_a_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=in.nextInt();
        System.out.print("Which number you want to count: ");
        int find=in.nextInt();
        int count=0;
        while (num>0) {
            int rem=num%10;
            if (rem==find) {
                count++;
            }
            num=num/10;
        }
        System.out.print("Total number of "+find+" are "+count);
    }
}