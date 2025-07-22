
public class Inverted_number {
    

public static void main(String[] args) {
    

    int n = 5;

    for (int i = 1; i <=n; i++) {  //i= 1 2 3 4 5
        for (int j = 1; j <=n+1-i; j++) { //5+1 - 4
            System.out.print(j);
        }
        System.out.println();
    }
}

}
