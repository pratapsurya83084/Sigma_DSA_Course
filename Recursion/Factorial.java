
public class Factorial {

    public static int fact(int n) {
        if (n == 1) {
            // System.out.print(1+ " ");
            return n;
        }
        return n * fact(n - 1);
    }



    public static void main(String[] args) {

        int n = 4;

        int res = fact(n);
        System.out.print("factorial of 5 is : " + res);

    }
}
