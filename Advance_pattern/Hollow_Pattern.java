package Advance_pattern;
public class Hollow_Pattern {

    public static void hollowPattern() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {

        hollowPattern();

    }

}
