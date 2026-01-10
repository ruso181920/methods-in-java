
import java.util.Scanner;

public class CalculateSum {
    public static int calculateSum(int num1 ,int num2) {
     int sum=num1+num2;
     return sum;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("enter a :");
        int a=inp.nextInt();
        System.out.print("enter b :");
        int b=inp.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("sum is :" + sum);
    }
}
