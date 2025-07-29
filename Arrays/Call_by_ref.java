

public class Call_by_ref {

    public static void update(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+1;  // if i=0 , 89 = 89+1 //update  value i.e call by refrence
        }
    }
    
public static void main(String[] args) {
    int arr[] = {89,90,99};

    update(arr); // call by reference refrence is update in main function 

   for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
   }


}

}
