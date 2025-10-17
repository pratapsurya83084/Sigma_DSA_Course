
public class MergeSort {


    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // mergeSort array

    public static void Merge_sort(int[] arr, int startIndex, int endIndex) {
      // base case
        if (startIndex >= endIndex) {
            return;
        }

        int mid = (startIndex + endIndex) / 2; // 0 1 2 = 3

        Merge_sort(arr, startIndex, mid); // lefthalf 0 to mid
        Merge_sort(arr, mid + 1, endIndex); // right half mid+1 to end
        mergeArr(arr, startIndex,endIndex , mid);
    
    }



      public static void mergeArr(int[] arr, int startIndex,int endIndex , int mid) {
        
        int[] mergedArr = new int[endIndex - startIndex + 1];

        int i = startIndex, j = mid + 1, k = 0;

        while (i <= mid && j <= endIndex) {
            if (arr[i] <= arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mergedArr[k++] = arr[i++];
        }

        while (j <= endIndex) {
            mergedArr[k++] = arr[j++];
        }

        for (int p = 0; p < mergedArr.length; p++) {
            arr[startIndex + p] = mergedArr[p];
        }
    }



    public static void main(String[] args) {

        int[] arr = { 3, 1, 4, 2, 0, 5 };


        Merge_sort(arr ,0 , arr.length-1);
        PrintArr(arr);

    }
}
