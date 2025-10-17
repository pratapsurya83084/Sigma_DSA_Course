

public class SetithBit {

public static int setibit(int n,int i){
    int  bit = 1<<i;
    return bit| n;
}

    public static void main(String[] args) {
     int res =  setibit(10,2);
    System.out.println(res);
    }
}
