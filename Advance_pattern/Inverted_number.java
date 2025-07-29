
public class Inverted_number {
    

public static void main(String[] args) {
    
    int n = 5;

    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n+1-i; j++) {  //1 2 3 4 5    n = 5  , i=3 , n+1-3 = 3
                                       //1 2 3 4
            System.out.print(j+" ");
        }System.out.println();
        }



}

}
