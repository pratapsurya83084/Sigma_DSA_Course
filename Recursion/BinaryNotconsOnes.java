
class BinaryNotconsOnes{


public static void strG(int n,int lastDigit,String str){

 if (n==0){
System.out.println(str);
return;
 }

strG(n-1, 0, str+"0");
 if (lastDigit == 0) {
    strG(n-1, 1, str+"1");
 }

}


    public static void main(String[] args) {
      strG(3,0,"");
    }
}
