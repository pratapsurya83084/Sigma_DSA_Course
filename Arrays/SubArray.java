public class SubArray {
    public static void SUBarr(int num[]) {
        // find min sumofSubarr and MaxsumofSubarr
        int max = num[0]; // 2
        int min = num[0];// 2

        //brute force approach using
        for (int i = 0; i < num.length; i++) {
            int start = i;

            for (int j = i; j < num.length; j++) {
                int end = j;
                int sumOfSubarr = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " "); // subArray print
                    sumOfSubarr += num[k];

                }
                System.out.println(" sum of subarray : " + sumOfSubarr);

                if (max < sumOfSubarr) {
                    max = sumOfSubarr; // store max value
                }

                if (min > sumOfSubarr) {
                    min = sumOfSubarr;// store min value
                }

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum of subarray : " + max);
        System.out.println("min sum of subarray : " + min);

    }

    public static void main(String[] args) {
        // int arr[] = { 2, 4, 6, 8, 10 };
          int[] arr = { 1, -2, 6, -1, 3 };
        SUBarr(arr);

    }
}
