

public class LastOccurance {
    public static int LastOccura(int[] arr, int key, int i) {

        if (arr.length == i) {
            return -1;
        }

        int found = LastOccura(arr, key, i+1);
    
        if (found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    
    }

    public static void main(String[] args) {

        int[] arr = { 1 , 2 , 2 , 3 , 5 , 6 , 3 , 7, 8, 9 };
        int key = 2;
        int i = 0;

        int res = LastOccura(arr, key, i);
        System.out.print(res);

    }


}
