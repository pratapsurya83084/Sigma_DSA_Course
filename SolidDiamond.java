public class SolidDiamond {
    public static void main(String[] args) {
        int n = 5; // Height of the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        } 

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
