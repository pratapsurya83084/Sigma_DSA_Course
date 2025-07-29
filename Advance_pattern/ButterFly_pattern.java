
public class ButterFly_pattern {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // left side
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // print middle space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // print right star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // below part

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
