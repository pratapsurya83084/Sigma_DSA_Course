
public class Search_key {


    //O(n) = time complexity
    public static boolean searchKeys(int[][] matrix, int key) {
        int row = 0, col = matrix.length - 1;

        while (row <= matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("(" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("key not found in matrix");
        return false;
    }



// O(n2) = time complexity

public static boolean srch(int[][] arr,int key){

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
      if (arr[i][j]==key) {
              System.out.println("yes key is exists at cell :"+"("+ i + " ," + j+ ")");
              return true;
      }
        }
    }
       System.out.println("not found your key in matrix");
    return false;
 
}



    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        int key = 0;
        boolean r = searchKeys(arr, key);

        System.out.println(r);

       boolean res = srch(arr,key);
    System.out.println(res);
    }
}
