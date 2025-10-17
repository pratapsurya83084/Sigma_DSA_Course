
public class PowerPrint {

public static int PowerX(int x,int n){

if (n == 0) {
    return 1;
}

return x * PowerX(x ,  n-1);

}

    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        int res = PowerX(x, n);
        System.out.println("the power is : " + res);

    }

}
