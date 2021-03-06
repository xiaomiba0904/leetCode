package LeetCode;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        Integer sum = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                sum += prices[i+1] - prices[i];
            }
        }

        return sum;
    }
}
