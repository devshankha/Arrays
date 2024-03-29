
//THis is my own interpretation of equilibrium point of an array
//takes an additional auxillary array, but it works fine
//the idea here is to take additional array s, which contains the sum of the
//elements of arr, then take left and right sum in s and compare till lsum is
//equal to rsum, if you find at index k they are equal, we have found equilibrium point,
//else equilibrium point does-not exist
public class EquilibriumPoint {
	static int findEquilibrium(int[] arr) {
		int s[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				s[i] = arr[i];
			} else
				s[i] = s[i - 1] + arr[i];
		}
		int sum = s[s.length - 1];
		int lsum = 0;
		int rsum = sum;
		for (int k = 1; k < arr.length; k++) {
			lsum = lsum + arr[k - 1];
			rsum = sum - s[k];
			if (lsum == rsum)
				return k;

		}
		return -1;

	}
	public static void main(String[] args) {
		int[] fd = {-7, 1, 5, 2, -4, 3, 0};
		int d = findEquilibrium(fd);
		System.out.println(d);
		
	}

}
