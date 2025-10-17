
public class GetIthBit {

 
    public static int getithBit(int n ,int i){

        int bit = 1<<i;

        if ((n & bit) == 0) {
           return 0;
        }else{
         return 1;
        }

    }

    public static void main(String[] args) {
        
     int res =  getithBit(10,3);
    System.out.println(res);
    }
}
