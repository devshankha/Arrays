//This works in O(n)
import java.util.HashSet;
public class FindPairs {
	static void  findPairs(int arr[],int sum) {
		HashSet s = new HashSet();
		for (int i=0; i < arr.length;i++) {
			s.add(arr[i]);
		
			int k = sum-arr[i];
			if (s.contains(k)) {
				System.out.println("pair is "+arr[i]+" "+k);
			}
		}
		
		
	}
	public static void main(String[] args) {
		int ls[] = {56,1,4,7,3,6,14,2,5};
		findPairs(ls,7);
		
	}

}
