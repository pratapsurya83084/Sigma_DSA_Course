
public class Stock_sell {

    public static int buAndSaleStocks(int prices[]) {

        int buyingPrices = Integer.MAX_VALUE;
        int Maxprofit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (buyingPrices < prices[i]) { // if peices selling is high then sale it, profit
                int profit = prices[i] - buyingPrices;
                Maxprofit = Math.max(Maxprofit, profit);
            } else {
                buyingPrices = prices[i]; /// if sell stock in loss then don't sale , buy other stock
            }
        }
        return Maxprofit;

    }

    public static void main(String[] args) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };

        int res = buAndSaleStocks(prices);
        System.out.println("total max profit is : " + res);

    }

}
