
public class Binomial_Coef {

    public static int factorial(int n,int r) {
        int fn = 1; // n factoriaL find out here
      
        for (int i = 1; i <= n; i++) {
            fn = fn*i;
        }

        int fr=1;
          for (int i = 1; i <=r; i++) {
            fr = fr*i;
        }

   int fnmr=1;
          for (int i = 1; i <=n-r; i++) {
            fnmr = fnmr*i;
        }

        return fn/(fr*fnmr);


    }

 

    public static void main(String[] args) {


 
        System.out.println("the binomial coefficient is  : " + factorial(5,2));

    }

}
