
public class Count7Inarray {

    public static int count7(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 7) {
                    count = count + 1;
                }
            }
        }

        if (count > 0) {
            return count;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 7, 7, 5 },
                { 2, 8, 0 }
        };
        int res = count7(arr);
        System.out.println("count : " + res);
    }
}
