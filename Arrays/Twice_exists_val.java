
public class Twice_exists_val {
    public static boolean valIsExistTwice(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j2 = i + 1; j2 < arr.length; j2++) {
                if (arr[i] == arr[j2]) {
                    return true;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        boolean result = valIsExistTwice(arr);
        System.out.println(result);
    }

}
