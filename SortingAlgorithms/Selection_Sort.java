
public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 3, 2 };

        for (int i = 0; i < arr.length; i++) {
            int min = i; // 1
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) { // if want to dscending order then use < sign
                    min = j; // 1
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
