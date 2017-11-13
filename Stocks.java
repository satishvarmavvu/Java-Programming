
public class Stocks {
	
	public static int maxProfit(int[] prices) {
		int max  = 0;
		int diff;
		for (int i=0; i < prices.length; i++) {
			for (int j=1; j < prices.length; j++) {
				diff = prices[i] - prices[j];
				if (max < diff) {
					max = diff;
				}
			}
		}
		return max;
	}
	
	public static int maxProfitY(int[] prices) {
		if (prices.length < 2) {
			throw new IllegalArgumentException("We need atleast 2 prices to calculate profit");
		}
		
		int minVal = prices[0];
		int maxProfit = 0;
		int profit = 0;
		
		for (int i=0; i < prices.length - 1; i++) {
			if (prices[i] < minVal) {
				minVal = prices[i];
			}
			profit = prices[i + 1] - minVal;
			maxProfit = Math.max(profit, maxProfit);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] stock_prices =  {10, 7, 5, 8, 11, 9};
		int profit = maxProfitY(stock_prices);
		
		System.out.println("Max profit that can be made yesterday is " + profit);
	}

}
