

public class Clearith {

    public static void main(String[] args) {
        int i = 1; 
        int n = 10; 
        int bitMask = ~(1<<i);
       int res =  n&bitMask;
    System.out.println(res);
    
    }
}
