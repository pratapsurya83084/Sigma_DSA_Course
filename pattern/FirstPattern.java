
class FirstPattern {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n; i++) {  //row 1
            // System.out.println(i);
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");     // row 1 print 3 spaces and 1 star
            }

            for (int j = 1; j <= i; j++) {   //print star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

//