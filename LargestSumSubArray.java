

//prints the subarray with the largest contiguous sum
//start and end will give the indices of the array

public class LargestSumSubArray {
	static int maxSubArraySum(int a[],int size) 
    { 
		int max_so_far = a[0];
				int max_ending_here = 0;  
				int start=0,end=0,s=0;
		  
	    for (int i = 0; i < size; i++)  
	    {  
	    	 max_ending_here = max_ending_here + a[i]; 
	            if (max_so_far < max_ending_here) {
	                max_so_far = max_ending_here; 
	                start = s;
	                end = i;
	            }
	            if (max_ending_here < 0) {
	                max_ending_here = 0; 
	                s=i+1;
	            }
	          
	    }  
	    System.out.println("start is "+start+" end is "+end);
	    return max_so_far;  
    } 
	public static void main(String[] args) {
		int ls[]= {2,-4,18,-1,6,-5,5};
		//Fiery.maxSubArraySum(ls);
		System.out.println(LargestSumSubArray.maxSubArraySum(ls,ls.length));
	   }
		
	}

