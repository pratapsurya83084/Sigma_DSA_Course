
public class PrintDecOrderNum {


    public static void fnum(int n) {
        if (n == 1) {
          System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        fnum(n - 1);
    }


    public static void main(String[] args) {
        
         fnum(10);
        // System.out.println(res);
 
    }

}
