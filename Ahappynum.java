public class Ahappynum {

    public static int sumOfSquares(int num) {

        int happyNum = 0;

        while (num > 0) {
            // find last digit of num and square it
            int Lastnum = num % 10; // got last digit of num = 104
            happyNum = happyNum + (Lastnum * Lastnum); // 4*4
            // remove last num
            num /= 10;
        }

        return happyNum;

    }

    public static boolean checkNum(int n) {

        // if n is 1 then already happy if n is 4 then never happy
        while (n != 1 && n != 4) {
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 18;
        boolean a = checkNum(n);
        String res = a ? n + " : is a happy number" : n + " : is not a happy number";

        System.out.println(res);
    }

}
