import java.util.Scanner;

public class DecNumtobinary {
   public static int decToBin(int n) {
    int bin=0;
    int pow=0;
    while(n>0) {
        int ld=n%2;
        bin=bin+(ld*(int)Math.pow(10,pow));
        n=n/2; 
        pow++; 
    }

  
   return bin;
   }

     public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("enter a decimal number :");
            int n = inp.nextInt();
             System.out.println("The binary number is : "+decToBin(n)); 
        }

 


}
