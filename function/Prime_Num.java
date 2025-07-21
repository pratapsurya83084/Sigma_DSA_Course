



public class Prime_Num {

public static boolean isPrime(int num){

int n = num;  // 4
      //those num is prime which divides by itself and 1 i.e reminder is = 0 ,   
if(num<=1) return false;

for (int i = 2; i <=num-1; i++) {
   if (num%i==0) {
    return false;
   } 
}
 return true;

}



    
public static void main(String[] args) {
  if (isPrime(23)) {
    System.out.println("the number is prime");
  }else{
    System.out.println("number is not prime");
  }
// System.out.println(a);
}
    
}
