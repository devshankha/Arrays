import java.util.Arrays;

/*
 * Sort an array of 0s,1s and 2s
 */
public class Arrangeposnnegative {
	public static int[] countWays(int[] a) {
		int low = 0;
		int len = a.length;
		int high = len-1;
		while (true) {
			while (low <= (a.length-1) && a[low] < 0)
				low++;
			while (high >= 0 && a[high] >  0)
				high--;
			if (low <=high) {
				int t = a[low];
				a[low] = a[high];
				a[high] = t;
				
			} else
				break;
		}
		System.out.println(Arrays.toString(a));
		return a;
	
	}



	public static void main(String[] args) {
		int k[] = { 13,-5,1,-2,-4,8 };
		Arrangeposnnegative.countWays(k);

	}

}
