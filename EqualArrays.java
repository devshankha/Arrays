
/*
 * 
 * Given two arrays of same size, we need to convert the first array 
 * into another with minimum operations. In an operation, we can either increment 
 * or decrement an element by one. Note that orders of appearance of elements do not need 
 * to be same.
 */


package src.main;

import java.util.Arrays;

public class EqualArrays {
	static int MinOperation(int a[], int b[], int n) {
// sorting both arrays  
// in ascending order 
		Arrays.sort(a);
		Arrays.sort(b);

// variable to store  
// the final result 
		int result = 0;

// After sorting both arrays 
// Now each array is in non- 
// decreasing order. Thus, 
// we will now compare each 
// element of the array and 
// do the increment or decrement 
// operation depending upon the 
// value of array b[]. 
		for (int i = 0; i < n; ++i) {
			/**if (a[i] > b[i])
				result = result + Math.abs(a[i] - b[i]);

			else if (a[i] < b[i])
				result = result + Math.abs(a[i] - b[i]); */
			result = result + Math.abs(a[i] - b[i]);
		}

		return result;
	}
	public static void main(String[] args) {
		int a[] = {10, 11, 4}; 
	    int b[] = {1, 2, 8}; 
	    int n = a.length; 
	    System.out.println(MinOperation(a, b, n)); 
	}

}
