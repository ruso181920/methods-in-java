import java.util.Scanner;

public class Binomial {
     public static int factorial(int n) {
     int fact=1;
     if (n==0) {
        return  fact=1;
     }
     
     else{
         for(int i=2;i<=n;i++) {
          fact=fact*i;
     }
    
    }
     return fact;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("enter a positive number n :");
        int n=inp.nextInt();
        System.out.print("enter the base r :");
        int r=inp.nextInt();
        int numerator=factorial(n);
        System.out.println("numerator is : "+numerator);
        int denom=  factorial(n-r) * factorial(r);
        System.out.println("denom is : "+denom);
        int ans= numerator/denom;
        System.out.println("Answer is : " + ans);
    }
}



