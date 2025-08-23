import java.util.*;

public class Inbuilt {

    public static void main(String[] args) {
        Integer arr[] = { 4, 2, 1, 5, 6 ,0};    // inbui;lt sort only work in Integer object
  

        Arrays.sort(arr,0 ,1, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
