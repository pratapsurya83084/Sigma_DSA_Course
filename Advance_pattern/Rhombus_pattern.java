
public class Rhombus_pattern {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n + 1 - i; j++) {
                // print space
                System.out.print(" ");
            }
            // print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < n + 1 - i; j++) {

                System.out.print("*");

            }
            System.out.println();

        }

    }

}
