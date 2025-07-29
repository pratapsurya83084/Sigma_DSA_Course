
public class Largest_val {

    public static int largestVal() {
        int[] arr = { 1, 2, 3, 14, 5, 9 };
        int largest = arr[0];
         
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println("the largest number is :  " + largestVal());
    }

}
