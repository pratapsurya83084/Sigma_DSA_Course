
public class Insertion {

    public static void main(String[] args) {

        int[] arr = { 5, 4, 1, 3, 2 };

        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i]; // 1
            int prev = i - 1; // 0

            // if prev >=0 and arr[prev] > arr[curr] then shift 1st index assigned
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
