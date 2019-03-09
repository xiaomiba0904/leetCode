package LeetCode;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        Integer min = prices[0];
        Integer value = 0;
        for (int i = 0; i < prices.length - 1 ; i++) {
            if (prices[i] < prices[i+1]) {
                Integer tmp = prices[i+1] - prices[i];
                value = tmp>value ? tmp : value;
                min = prices[i]<min? prices[i]: min;
                value = (prices[i+1] - min) > value ?(prices[i+1] - min) : value;
            }
        }
        return value;
    }

    public int maxProfit2(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(prices[i] - min, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        int[] test = {3,7,1,5,3,6,4};
        System.out.println(b.maxProfit2(test));
    }
}
