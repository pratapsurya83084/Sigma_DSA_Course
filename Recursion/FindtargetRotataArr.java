
class FindtargetRotataArr {

    public static int SearchTarget(int[] arr, int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }
        // find mid
        int mid = (si + ei) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (target <= arr[mid] && arr[si] <= target) {
            if (target < arr[mid]) {
                return SearchTarget(arr, target, si, mid);
            } else {
                return SearchTarget(arr, target, mid + 1, ei);
            }
        } else {
            return SearchTarget(arr, target, mid + 1, ei);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 0, 1, 2 };
        int target = 0;
        int res = SearchTarget(arr, target, 0, arr.length - 1);
        System.out.println(res);
    }
}