import java.util.Arrays;
//this is a variation of the buy/sell problem, two versions are there
//1 -- you can buy and sell any number of times, very simple and works method is here== maxProfit
// it uses the peak and valley approach, code is inspired from here = https://www.youtube.com/watch?v=K8iHi8AW1ls
//2 -- buy and sell atmost K transactions allowed, this requires dynamic programming--maxProfit,code is from
//geekforgeeks
public class MaximumProfit {

	
	static int maxProfit(int price[])
	{
		int profit = 0;
		for (int i =1; i < price.length;i++) {
			if (price[i] > price[i-1])
				profit+=price[i] -price[i-1];
		}
		return profit;
	 
	   
	}
	
	static int maxProfit(int[] price, int n, int k) {

// table to store results
// of subproblems
// profit[t][i] stores
// maximum profit using
// atmost t transactions up
// to day i (including day i)
		int[][] profit = new int[k + 1][n + 1];

// For day 0, you can't
// earn money irrespective
// of how many times you trade
		for (int i = 0; i <= k; i++)
			profit[i][0] = 0;

// profit is 0 if we don't
// do any transation
// (i.e. k =0)
		for (int j = 0; j <= n; j++)
			profit[0][j] = 0;

// fill the table in
// bottom-up fashion
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j < n; j++) {
				int max_so_far = 0;

				for (int m = 0; m < j; m++)
					max_so_far = Math.max(max_so_far, price[j] - price[m] + profit[i - 1][m]);

				profit[i][j] = Math.max(profit[i][j - 1], max_so_far);
			}
		}

		return profit[k][n - 1];
	}
	 


	
	
	
	
	public static void main(String[] args) {
		//int[] mm = {10,15,12};
		//int[] mm = {3,5,40,90};
		int[] mm = {7,1,5,3,6,4};
		
		//System.out.println(arff(mm));
		System.out.println(maxProfit(mm));
		
		
}
}
