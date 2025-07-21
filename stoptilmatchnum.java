import java.util.Scanner;

public class stoptilmatchnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
           
// System.out.println(n + " ");
          while (true) {
            System.out.print("enter your number :");
            int n = sc.nextInt();
            
            if (n % 10 == 0) {
                // System.out.println("");
                continue;
                
            }else{
                System.out.println(n);
            }
          }


    }
}
