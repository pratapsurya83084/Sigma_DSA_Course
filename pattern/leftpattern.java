package pattern;
public class leftpattern {
 public static void main(String[] args) {
    int n = 5;



for (int i = 0; i < n; i++) {          // i = 0,1,2,3
    for (int j = 0; j <i ; j++) {       //j = 0 ,1,2 ,3
        System.out.print("*");
    }
    System.out.println();
}


 }   
}

//  * 
//  * *
//  * * *
//  * * * *