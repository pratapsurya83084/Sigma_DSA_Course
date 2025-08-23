public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 6, 1};

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];   // pick current element
            int prev = i - 1; // 0

            // shift larger elements to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--; //  -1 
            }

            // place the current element in its correct position
            arr[prev + 1] = curr;  // [-1+1]=
        }

        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
