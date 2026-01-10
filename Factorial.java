import java.util.Scanner;
public class Factorial {
    public static int factorial(int n) {
     int fact=1;
     if (n==0) {
        //fact=1;
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
        System.out.print("enter a positive number :");
        int a=inp.nextInt();
        
        int Factorial =factorial(a);
        System.out.println("factorial is : " + Factorial);
    }
}

