public class RotatedBinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Found target
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {   //4<=7  true
                if (target >= nums[left] && target < nums[mid]) {  // false 
                    right = mid - 1; // Target in left half
                } else {
                    left = mid + 1;  // Target in right half 
                }
            } 

            // Otherwise, right half must be sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Target in right half
                } else {
                    right = mid - 1; // Target in left half
                }
            }
        }

         
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(search(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(search(nums2, target2)); // Output: -1
    }
}
