package pattern;
public class Hollow_rectangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 6;

        for (int i = 1; i <= row; i++) { // 1 to 4
            for (int j = 1; j <= col; j++) { // 1 to 5

                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
