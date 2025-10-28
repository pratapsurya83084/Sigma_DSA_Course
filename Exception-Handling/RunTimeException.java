
public class RunTimeException {

    
    public static void main(String[] args) {
       try {
         int a = 10;
         int result = 10/0;
         System.out.println(result);
       } catch (ArithmeticException e) {
    //    System.out.println(e);
    System.out.println("zero cannot divisible any number");
       }

    }
}
