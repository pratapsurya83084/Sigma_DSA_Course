public class Unique {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 2, 1,5,0}; // 3, 5 are unique

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Compare arr[i] with all elements
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If element appears only once → unique
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
