public class CheckEvenOrOdd {
    //accept integer and check it even or not if even then return true else return false 

    public static boolean isEven(int num){

           if (num%2==0) {
            return true;
           }else{
            return false;
           }
    }


public static void main(String[] args) {
    int n=4;
   boolean result = isEven(n);
   System.out.println(result);
}

}
