
// Write a program that reads a set of integers, and the n prints the sum of the even and odd integers.

import java.util.Scanner;

public class sumOroddnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("how many number you enter :");
        int n=sc.nextInt();

        Integer[] arr= new Integer[n];  // n is size of arr

       System.out.println("enter set of element :");
        for (int i = 0; i <n; i++) {
           arr[i]=sc.nextInt();          //n   number accept from  user
        }


        //after storing number check even and sum 
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <n; i++) {
            if (arr[i]%2==0) {
                evenSum = evenSum + arr[i];
            }else{
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("even Sum is : " +evenSum );
        System.out.println("oddSum Sum is : " +oddSum );

    }
}
//0,1,2,3,4      es=2+4+6 = 12  ,os = 5 + 7 = 12   
//2,4,5,6,7