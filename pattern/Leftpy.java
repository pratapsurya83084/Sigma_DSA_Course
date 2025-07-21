
class Leftpy {
    public static void main(String[] args) {
        int n = 5; // Number of columns

        for (int i = 1; i <= n; i++) {  // 3 to 5 rows 
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" "); // 1 to 5-1 print space 2 to 4  , 3 to 4
            }

            // Print stars
            for (int j = 1; j <= i; j++) { // 1 to 1 means 1 column print star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
