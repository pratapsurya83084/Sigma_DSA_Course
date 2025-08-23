public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int firstStartRow = 0;
        int firstStartCol = 0;
        int lastEndRow = arr.length - 1; // rows - 1
        int lastEndCol = arr.length - 1; // cols - 1
// System.out.println(arr.length);
        while (firstStartRow <= lastEndRow && firstStartCol <= lastEndCol) {

            // 1. Print top row
            for (int j = firstStartCol; j <= lastEndCol; j++) {
                System.out.print(arr[firstStartRow][j] + " ");
            }
            firstStartRow++;

            // 2. Print right column
            for (int i = firstStartRow; i <= lastEndRow; i++) {
                System.out.print(arr[i][lastEndCol] + " ");
            }
            lastEndCol--;

            // 3. Print bottom row (if still valid)
            if (firstStartRow <= lastEndRow) {
                for (int j = lastEndCol; j >= firstStartCol; j--) {
                    System.out.print(arr[lastEndRow][j] + " ");
                }
                lastEndRow--;
            }

            // 4. Print left column (if still valid)
            if (firstStartCol <= lastEndCol) {
                for (int i = lastEndRow; i >= firstStartRow; i--) {
                    System.out.print(arr[i][firstStartCol] + " ");
                }
                firstStartCol++;
            }

        }
    }
}
