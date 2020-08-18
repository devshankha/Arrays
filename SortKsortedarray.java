
/**
 * Sort a nearly sorted (or K sorted) array
Last Updated: 24-12-2019
Given an array of n elements, where each element is at most k away from its target position,
 devise an algorithm that sorts in O(n log k) time. For example, let us consider k is 2, 
 an element at index 7 in the sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



//solution taken from geekforgeeks, slightly modified
//https://www.geeksforgeeks.org/nearly-sorted-algorithm/
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SortKsortedarray {
	
	private static void kSort(int[] arr, int n, int k)  
    { 
  
        // min heap 
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); 
  
        // add first k + 1 items to the min heap 
        for(int i = 0; i < k + 1; i++) 
        { 
            priorityQueue.add(arr[i]); 
        } 
        int index = 0; 
        for(int i = k + 1; i < n; i++)  
        { 
        	arr[index++] = priorityQueue.poll();
            //priorityQueue.poll(); 
            priorityQueue.add(arr[i]);  
        } 
  
        Iterator<Integer> itr = priorityQueue.iterator(); 
  
        while(itr.hasNext())  
        { 
            arr[index++] = priorityQueue.poll();
            
        } 
    }
  
	
	
	public static void main(String[] args) {
		int k = 3; 
        int arr[] = {2, 6, 3, 12, 56, 8 }; 
        int n = arr.length; 
        kSort(arr, n, k); 
        System.out.println(Arrays.toString(arr));
		
	}

}
