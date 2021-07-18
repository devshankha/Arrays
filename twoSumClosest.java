import java.util.Arrays;
//Question
//Given an array nums of n integers, find two integers in nums such that the sum is closest to a given number, 
//target.Return the difference between the sum of the two integers and the target.
//code is taken from ==https://leetcode.com/discuss/interview-question/241808/google-onsite-two-sum-closest-to-target
public class twoSumClosest {
	public static int twoSumCloset(int[] nums, int target) {
		 if (nums == null || nums.length == 0) {
	            return 0;
	        }

	        Arrays.sort(nums);
	        int low = 0, high = nums.length - 1;
	        int diff = Integer.MAX_VALUE;

	        while (low < high) {
	            int sum = nums[low] + nums[high];

	            if (sum > target) {
	                high--;
	            } else {
	                low++;
	            }

	            diff = Math.min(diff, Math.abs(sum - target));
	        }

	        return diff;
	    }
   
	

	public static void main(String[] args) {
		
	}

}
