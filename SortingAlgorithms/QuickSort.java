
public class QuickSort {

    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // partioned pivot and move pivot to center
    public static void  Quick_sort(int[] arr, int si, int ei) {
         if (si >= ei) {
            return;
         }

        int pivotIdx = Partion(arr, si, ei);
       
        Quick_sort(arr, si, pivotIdx - 1);     // left smaller than pivot
        Quick_sort(arr, pivotIdx + 1, ei);     // right greater than pivot
    }



    public static int Partion(int[] arr, int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        i++;
         
        // swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }


    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 4, 0, 5 };

        Quick_sort(arr, 0, arr.length - 1);
        PrintArr(arr);

    }

}
