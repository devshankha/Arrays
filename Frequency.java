import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values. 
 * If multiple values have the same frequency, sort them in increasing order.
 * 
 * 
 * @author devshankhasharm
 *
 */

//code has been inspired from here == https://www.youtube.com/watch?v=IAUfxFDnPOc

public class Frequency {
	

	public static Integer[] frequencySort(Integer[] nums) {
		//store the value and frequency of occurences in a hashmap
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0; i < nums.length;i++) {
			if ((map.containsKey(nums[i]))) {
				map.put(nums[i], map.get(nums[i]+1));
				
			} else {
				map.put(nums[i], 1);
			}
		}
		
		for (int i=0; i < nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		//sort the array using the values of the frequences in the hashmap
		Arrays.sort(nums,(Integer k1,Integer k2)-> {
			int freq1 = map.get(k1);
			int freq2 = map.get(k2);
			if (freq1 != freq2) {
				return freq1-freq2;
			} else
				//if two numbers have same frequencies sort it in ascending order
			return k1-k2;
			
			
		});
		return nums;
		

	}
	
	
	public static void main(String[] args) {
		Integer[] nums = {3,2,2,3,4,2,4};
		frequencySort(nums);
		System.out.println(Arrays.toString(nums));
		
	}

}
