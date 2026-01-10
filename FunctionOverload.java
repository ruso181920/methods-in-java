
public class FunctionOverload {
     public static int calculateSum(int num1 ,int num2) {
      return num1+num2;
    }
     public static int calculateSum(int num1 ,int num2,int num3) {
      return num1+num2+num3;
    }

    public static void main(String[] args) {
       
    
        System.out.println("sum is :" + calculateSum(10,23));
         
        System.out.println("sum is :" + calculateSum(10,23,35));
    }
}
