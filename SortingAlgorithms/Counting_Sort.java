
public class Counting_Sort {

    public static void countingSort(int arr[]) {
        // find largest value
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        
        int count[] = new int[largest + 1]; // 5+1 = 6

        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4 5
            count[arr[i]]++; // count[4] +
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 3, 5 };
        countingSort(arr);
    }

}
