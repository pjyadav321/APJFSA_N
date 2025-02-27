/*

 */



public class BuySellStock {
    public static void main(String[] args) {
        int[] prices= {7,2,1,4,3,5,6};
       // maxProfit(prices);
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices)
    {
        int profit =0;
        int minPrice=prices[0];

        for (int i=1; i<prices.length; i++)
        {
            int currentPrice=prices[i];
            profit=Math.max(profit,currentPrice-minPrice);
            minPrice=Math.min(minPrice,currentPrice);
        }
        return profit;
    }
}
