
public class FindNonRepeated {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,4,4};
		int val = 0;
		for (int i=0 ; i < arr.length; i++) {
			val = val^arr[i];
			
		}
		System.out.println(val);
	}

}
