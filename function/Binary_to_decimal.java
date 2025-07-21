public class Binary_to_decimal {
    
public static void DecimalPrint(int binary){
// 101 binary  = 5 decimal

int power = 0;
int decimal = 0;

while (binary > 0) {
    //find last digit of binary   decimal += lastDigit*2^0;
    int lastDigit = binary % 10;  // get a lstDigit of num
    
  
    decimal = decimal +(lastDigit *(int)Math.pow(2,power));
   power++;
   //remove last added digit
binary = binary/10; // remove binary last digit

}

System.out.println("the Decimal number is : "+ decimal);

}

public static void main(String[] args) {
    int binary = 1000;

    DecimalPrint(binary);
}

}
