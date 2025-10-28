

public class FindLenofStr {

    public static int lenofStr(int si  ,String str){
      if (si == str.length()) {
          return 0;
      }
   return 1 + lenofStr( si + 1,str); 

    }

    public static void main(String[] args) {
        String str = "abcd";
     int e=   lenofStr(0,str);                    // a ,0+1 =b ,1+1= c , 2+1 = d = 4
    System.out.println(e);
    }
}
