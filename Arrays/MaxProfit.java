

public class MaxProfit {

    public static int maxProfits(int[] priceOfStock){

        int Maxprofit = 0;
        int buyStock = Integer.MAX_VALUE;

         for (int i = 0; i < priceOfStock.length; i++) {
            
              if (buyStock < priceOfStock[i]) {
                
            int profit = priceOfStock[i] - buyStock;
                Maxprofit = Math.max(Maxprofit, profit);
              }else{
                buyStock = priceOfStock[i]; //if stock price is low then buy stock
              }


         }
         return Maxprofit;

    }


    public static void main(String[] args) {
        int[] prices ={7, 6, 4,  3, 1}; //{7,1,5,3,6,4};
        System.out.println(maxProfits(prices));
    }

}
