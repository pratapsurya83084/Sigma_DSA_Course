import java.util.*;

public class InputElem {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        int n = 3, m = 3;

        System.out.println("enter element : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2 d array matrix  is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
