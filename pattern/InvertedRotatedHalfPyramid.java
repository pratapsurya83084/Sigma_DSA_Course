public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        // int s = 5; // Number of rows

        // for (int i = 1; i <= s; i++) {
        // // Print spaces
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }

        // // Print stars
        // for (int j = i; j <= s; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }

        // int n = 5;
        // row
        // for (int i = 1; i <=n; i++) {
        // for (int j = 1; j <= n - i; j++) {

        // System.out.print(" "+ j);

        // }
        // System.out.println();
        // }

        // FLOYD'S Triangle Pattern

        // int n = 5;
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }

        // System.out.println();
        // }

        // 0-1 triangle pattern

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
               
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }

    }
}
