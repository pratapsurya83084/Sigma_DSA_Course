

public class EvenOdd {
   
public static void even(int n){
    int bit = 1;
    if ( ( n & bit) == 1) {
        System.out.println("odd");
    }else{
        System.out.println("even");
    }
}

    public static void main(String[] args) {
        even(2);
        even(4);
        even(5);
        even(10);
        
    }


}
