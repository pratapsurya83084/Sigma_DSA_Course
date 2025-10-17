
public class Fibonacci_series {

    public static int fibonacci(int n) {

        if (n == 0 || n==1) {
            return n;
        }

    
      int f1 =  fibonacci(n-1);
      int f2 = fibonacci(n-2);
        return f1+f2;
    }

    public static void main(String[] args) {
    int res = fibonacci(10);
System.out.println(res);
    }

}

// time complexity  = O(2^n)
//space complexity = O(n)