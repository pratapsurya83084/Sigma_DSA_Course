import java.util.*;

public class TripletsSum {

    public static List<List<Integer>> triplets(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr); // Step 1: Sort the array must 

        for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    // Skip duplicates for left and right
                    while (left < right && arr[left] == arr[left + 1])
                        left++;
                    while (left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> triplets = triplets(arr);
        System.out.println("Unique triplets: " + triplets);
    }
}
