
public class Sumof2ndRow {

    public static void main(String[] args){
        int arr[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };

        int sumOfSecondRow = 0;

        for (int j = 0; j < arr.length; j++) {
            // System.out.print(arr[1][j] + " ");
            sumOfSecondRow +=arr[1][j];
        }
        System.out.print("sum is : "+ sumOfSecondRow);
    }
}
