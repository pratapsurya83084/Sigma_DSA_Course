
public class FriendWaysStandpair_Single {


      public static int findWaysOfStanding(int n){


       // base case print
       if (n==1 || n==2) {
        return n;
       }


        return findWaysOfStanding(n-1) + (n-1) *findWaysOfStanding(n-2);
      }    



    public static void main(String[] args) {
        int n = 3;

        int res = findWaysOfStanding(n);

        System.out.println(res + " ways");
    }
}
