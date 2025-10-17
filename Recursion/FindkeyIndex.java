
public class FindkeyIndex {

    public static int isFind(int[] arr , int key , int i){

        if (arr.length-1 == i) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return isFind(arr, key, i+1);   
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 0;
        int res = isFind(arr , key , 0);

    if (res == -1) {
        System.out.println("your key not found in an array");
    }else{
        System.out.println("your key found in an array at index :" + res);
    }

    }
}
