import java.util.*;
public class PrimeFun {
    public static void checkPrime(int n) {
            if (n <= 1) {
                System.out.println("Enter a positive number greater than 1");
                return;
            }
            if (n == 2) {
                System.out.println("it's a prime number");
                return;
            }
            boolean isPrime = true;
            for (int i = 2;  i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("it's a prime number");
            } else {
                System.out.println("it's not a prime number");
            }
        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("enter a positive number :");
            int n = inp.nextInt();
            checkPrime(n);
            
        }
}
    




