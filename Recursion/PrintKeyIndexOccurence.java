


public class PrintKeyIndexOccurence {


   public static void printKeyOccurenceIndex(int si,int n,int key ,int[] arr){

   if (si>=n) { 
    if (arr[si]==key) {
        System.out.println(si);   
    }
    return;
   }

   if (arr[si]==key) {
    System.out.print(si+ " ");
   }

   // call here recusive
   printKeyOccurenceIndex(si+1, n, key, arr);


   }


    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6,7,2};
        int key = 2;
        printKeyOccurenceIndex(0,arr.length-1,key ,arr);
    }
}
