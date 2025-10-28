
public class ArraysException {

  public static void Avg(int n) throws ArithmeticException  {

    int sum = 0;

    // for (int i = 1; i <= n; i++) {
    //   sum += i;
    // }
    int avg = sum / n;
    // return avg;
    System.out.println(avg);
  }

  public static void main(String[] args) {
    int n = 3;
   try {
    System.out.println("result print :");
    Avg(n);
     
    //  System.out.println("the avarage is : " + res);
   } catch (Exception e) {
    System.out.println("zero cannot divisible by any number : ");
  System.out.println(e.getMessage());    
  }
  }
}
