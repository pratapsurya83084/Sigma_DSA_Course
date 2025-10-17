


public class CheckArrIsSort {

    public static boolean isSorted(int[] arr , int i){

     if (arr.length-1 == i) {
        return true;
     }

       if (arr[i] <= arr[i+1]) {
         return isSorted(arr, i+1);
          
       }
       return false;
    }


    public static void main(String[] args) {
   
        int[] arr = {0,1,2,3,4,5};
        int i=0;
      boolean res = isSorted(arr,i);
      if (res) {
        System.out.println("array is sorted");
      }else{
        System.out.println(" array is not sorted");
      }

    }
}
