
import java.util.*;
public class PrimeInRange {

 public static boolean  checkPrime(int n) {
      if(n<=0) {
        return false;
      }  
    
    if (n==2) {
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n) {
        for (int i=2;i<=n;i++) {
            if(checkPrime(i)) {
                System.out.print(i+" ");
            }
        }
        
    }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("enter a positive number :");
            int n = inp.nextInt();
            System.out.print("The Prime numbers in the range is : ");
            primeInRange(n);
        }
}
    





