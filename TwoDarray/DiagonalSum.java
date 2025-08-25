
public class DiagonalSum {

    public static void Diagonal_Sum(int[][] arr) {

        int sum = 0;

        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == n) {
                    sum += arr[i][j];
                }
                // if (i + j == n) {
                // secondaryDiagonalSum += arr[i][j];
                // }
            }
        }
        // int sum = primaryDiagonalSum + secondaryDiagonalSum;
        System.out.println("sum of left diagonal is : " + sum);

    }

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        Diagonal_Sum(arr);
    }
}
