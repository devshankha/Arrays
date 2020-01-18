import java.util.Arrays;

/*
 * Sort an array of 0s,1s and 2s
 */
public class SortArraysof {
	public static int[] countWays(int[] a) {
		int lo = 0;
		int mid = 0;
		int hi = a.length-1;
		int temp =0;
		while (mid <= hi) {
			   switch (a[mid]) { 
	            case 0: { 
	                temp = a[lo]; 
	                a[lo] = a[mid]; 
	                a[mid] = temp; 
	                lo++; 
	                mid++; 
	                break; 
	            } 
	            case 1: 
	                mid++; 
	                break; 
	            case 2: { 
	            	
	                temp = a[mid]; 
	                a[mid] = a[hi]; 
	                a[hi] = temp; 
	                hi--; 
	                break; 
	            } 
	            }
			   System.out.println("IIIIIIIIIIIIII "+mid+" "+Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
		return a;
	}



	public static void main(String[] args) {
		int k[] = { 2,1,0,0,1,2 };
		SortArraysof.countWays(k);

	}

}
