


public class Binary_search {

    public static int binarySearch(int arr[], int key) {
        int start = 0; // first element of arr
        int end = arr.length - 1; // 7

        // System.out.println(mid);

        while (start <= end) { // 0<6 true then
            // find mid
            int mid = (start + end) / 2; // (0+7)/2 is mid
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { // 8mid < 4  false so mid is large then mid--
                start = mid + 1;
            } else {          //8 mid > 4  yes then end = 8-1=7
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 4;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("your element or key is not found in at array");
        } else {
            System.out.println("your element or key is found at array : " + result);
        }

    }

}
