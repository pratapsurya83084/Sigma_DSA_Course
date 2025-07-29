import java.util.Scanner;

public class Array_Create {

    public static void main(String[] args) {

        int arr[] = new int[100];
        // int srr[] = { 1, 2, 34, 5 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        System.out.println(" enter 3 number : ");
        Scanner sc = new Scanner(System.in);

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        System.out.println(arr[0]);  
        System.out.println(arr[1]);  
        System.out.println(arr[2]);  

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }   
       
        

    }
}
