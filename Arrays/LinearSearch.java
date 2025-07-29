public class LinearSearch {
    
public static int linear_Search(String arr[] ,String key){

    for (int i = 0; i < arr.length; i++) {
        if (arr[i]==key) {
            return i;
        }
    }
    return -1;
}


public static void main(String[] args) {
    // int[] arr = {1, 2, 3, 4, 5,9};
    String []arr={"samosa" , "paneer","idli","slice","chicken"};
    // int key = 9;
String key = "samosa";
int a = linear_Search(arr,key);
if (a==-1) {
    System.out.println("your key not found in an arr");
}else{
    System.out.println("your key found at index "+a);
}

// System.out.println(" your key found at index number : "+ a);

}


}
