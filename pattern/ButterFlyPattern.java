public class ButterFlyPattern {
    public static void main(String[] args) {

        // int n = 4;

        // Upper Half
        // for (int i = 1; i <= n; i++) { // 1 to 4 rows
        // // Left wing
        // for (int j = 1; j <= i; j++) { // 1st row 1 star print
        // System.out.print("* ");
        // }

        // // Spaces
        // for (int j = 1; j <= 2 * (n - i); j++) { // 1 to 2*(4-1) = 6 , 1 to 6
        // System.out.print(" ");
        // }

        // // Right wing
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }

        // Lower Half
        // for (int i = n; i >= 1; i--) {  //4 3 2 1
        //     // Left wing
        //     for (int j = 1; j <= i; j++) {  // 1st row and 1st  1 to 4 star 
        //         System.out.print("* ");
        //     }

        //     // Spaces
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("- ");
        //     }

        //     // Right wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

  int n = 5;
  for (int i = 1; i <=n; i++) {
    // 1st row  1st column print space
    // 2nd row  2nd column print space

    for (int j = 1; j <=(n-i); j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <=i; j++) {
        System.out.print("*");
    }
System.out.println();

  }

    }
}
