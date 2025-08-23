
public class KadansAlgo {
    public static void kadanes(int num[]) {

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);// find max when cs is greater than zero
        }
        System.out.println("max sum of array is : " + ms);
    }

    public static void main(String[] args) {

        int arr[] = { -1, 2, -3, 4 }; // {-2,-3,4,-1,-2,1,5,-3};

        kadanes(arr);
        
    }

}
