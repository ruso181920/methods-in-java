import java.util.Scanner;

public class BinarytoDec {
   public static void bindec(int n) {
    int pow=0;
    int dec=0;
    while(n>0) { 
        if(n%10==0||n%10==1) { 
    int rem=n%10;
     dec=dec+(rem*(int)Math.pow(2,pow));
    n=n/10;
    pow++;

        }

        else{
            System.out.println("enter a binary numer only.");
           break;
            
        }
    } 
        System.out.print("The decimal of  binary  is : " + dec);

   }

     public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("enter a binary number :");
            int n = inp.nextInt();
              bindec(n);
        }


}
