
public class Inverted_half_pattern {

    public static void main(String[] args) {

        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) { // i=1 1 2 3 4 5
            // space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
