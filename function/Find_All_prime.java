//return all prime number between 1 to 10

public class Find_All_prime {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeNum(int num) {

        for (int i = 2; i <= num; i++) {

            boolean prime = isPrime(i); // it givees true or false

            if (prime) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 100;
        PrimeNum(n);

        // System.out.println();
    }

}
