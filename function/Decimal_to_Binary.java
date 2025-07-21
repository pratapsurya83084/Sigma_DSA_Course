

public class Decimal_to_Binary {

public static void BinaryPrint(int decimal){
//5 = 101 binary 
String Binaryremainder="";

while (decimal > 0) {
    int reminder = decimal%2;
    Binaryremainder = reminder + Binaryremainder;
    decimal = decimal/2;
}
System.out.println( "the binary number is : " + Binaryremainder + " ");
}

    public static void main(String[] args) {
        BinaryPrint(12);
    }




}
