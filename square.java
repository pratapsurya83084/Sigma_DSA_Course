class square {
    public static void main(String[] args) {
        // for (int i = 0; i <4; i++) {
        // System.out.println("****");
        // }

        // int i=1;
        // while (i<=4) {
        // System.out.println("$$$$");
        // i++;
        // }

        // int n = 10899;

        // if (number % 10 == 0) {
            // System.out.println("number reverse is : " + number%10);
        // }

        // while (number > 0) {
        //     int lastdigit = number%10;
            
        //     System.out.print(lastdigit); //print lastdigit
        //     number = number/10;    //remove lastdigit after print
          
        // }
    
       
        

        int n = 10899;    //1

        int  rev = 0; //9980

        while (n>0) {
      int lasdigit = n%10;  //ld = 0
      rev = (rev*10)+lasdigit;          //(9980*10)+0.1 = 99801;
     //remove ld
     n=n/10;   //after remove n = 0
        }
        System.out.println(rev);
       

    }
}