/** Stock Buy Sell to Maximize Profit
Last Updated: 17-12-2020
 
The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in 
those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by 
buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in 
decreasing order, then profit cannot be earned at all. 
Code is inspired from here ==
https://www.youtube.com/watch?v=eMSfBgbiEjk
*
**/
//the key idea here is to keep track of the smallest from left we have encountered so far and the profit till now

public class MaxProfit {
	
	static int maxProfit(int[] prices) {
		int maxProfit = 0;
		//here minPrice tracks the smallest element in the array as we go along from left 
		//to right
		int minPrice = Integer.MAX_VALUE;
		for (int i=0; i < prices.length;i++) {
			if (prices[i] < minPrice)
				minPrice = prices[i];
			else if (prices[i]-minPrice > maxProfit)
				maxProfit = prices[i]-minPrice;
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		int k = maxProfit(arr);
		System.out.println(k);
	}

}
