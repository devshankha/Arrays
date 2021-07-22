import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//Find all triplets in an array that add to a given sum ( 3 sum problem)
//My own implementation, two techniques, one using hashing and the other using 2  pointers
public class FindTriplets {
	
	
	static void findTripletswithHashing(int[] arr, int n) {
		Arrays.sort(arr);
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			Set<Integer> m = new HashSet<Integer>();
			m.add(arr[i]);
			for (int j = i + 1; j < len; j++) {
				m.add(arr[j]);
				int k = n - (arr[i] + arr[j]);
				//these are checks to see we dont include repeated triplets
				if (m.contains(k) && k != arr[i] && k != arr[j]  )
					System.out.println("Triplet found " + arr[i] + " " + arr[j] + " " + (n - (arr[i] + arr[j])));

			}

		}

	}

	static void findTriplets(int[] arr, int n) {
		Arrays.sort(arr);
		int len = arr.length;
		List<List<Integer>> l1 = new ArrayList<>();
		for (int i = 0; i < (len - 2); i++) {
			int l = i + 1;
			int r = arr.length - 1;
			while (l < r) {

				if ((arr[i] + arr[l] + arr[r]) == n) {
					System.out.println("Triplet found " + arr[i] + " " + arr[l] + " " + arr[r]);
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(arr[i]);
					temp.add(arr[l]);
					temp.add(arr[r]);
					l1.add(temp);
					break;
				}
				if ((arr[i] + arr[l] + arr[r]) < n)
					l++;
				else
					r--;
			}

		}
		System.out.println("Printing the lists "+l1);
	}

	public static void main(String[] args) {
		int[] k = {1,2,3,4,7,11,18};
		int n = 16;
		findTriplets(k,n);
		System.out.println("-----------------");
		findTripletswithHashing(k, n);

	}

}
