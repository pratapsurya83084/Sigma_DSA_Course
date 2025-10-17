


public class SumOfNat {


    public static int sumNat(int n){


        if (n==0) {
            return 0;
        }
        int s = 0;
       s = n + sumNat(n-1);  // n-1 = 5-1 = 4 
     return s;
        // System.out.println();
   

    }

    public static void main(String[] args) {
      int res =  sumNat(5);  // 1+2+3+4+5 = 15
    System.out.println(res);
    }

}
