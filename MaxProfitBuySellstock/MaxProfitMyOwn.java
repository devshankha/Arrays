//My own implementation, seems to be working
public class MaxProfitMyOwn {
	
	
	
	static int findIt(int[] arr) {
		int maxProfit = 0;		
		int low = arr[0];
		for (int i=1; i < arr.length;i++) {
			if (arr[i] > low) {
				int profit = arr[i]-low;
				if (profit > maxProfit)
					maxProfit =  profit;
			} else {
				low = arr[i];
			}
			
		}
		return maxProfit;
		
		
	}
	
	public static void main(String[] args) {
		int[] l = {100, 180, 260, 310, 40, 535, 695};
		//int[] l = {1,3,5};
		//7,1,5,3,6,4
		//int[] l = {7,1,5,3,6,4};
		System.out.println(MaxProfitMyOwn.findIt(l));
		
		
	}

}
