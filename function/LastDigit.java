

public class LastDigit {
 
    public static void Iszero(int num){
       int sum = 0;



       while (num>0) {
        //find lasdigit add to the sum
       int lastDigit = num % 10;
       sum = sum + lastDigit;
       //remove lastdigit
       num = num/10;
       }

       System.out.println("the sum of digit is : " + sum);
    }

    public static void main(String[] args) {
        Iszero(1026);
    }

    
}
