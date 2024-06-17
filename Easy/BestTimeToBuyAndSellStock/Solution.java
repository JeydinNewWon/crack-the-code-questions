package Easy.BestTimeToBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int lowest = prices[0];

        for (Integer price : prices) {
            if (price < lowest) lowest = price;
            res = Math.max(res, price - lowest);
        }

        return res;
    }
}
