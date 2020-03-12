import java.util.Arrays;

public class Segregare0sand1s {
	static int[] swapArray(int a[]) {
		int l = 0;
		int r = a.length-1;
		while (true) {
			while((l< (a.length-1)) && (a[l]==0))
				l++;
			while (r >=0 && a[r] ==1)
				r--;
			if (l >= r)
				break;
			else {
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
			}
			
		}
		return a;
		
	}
	public static void main(String[] args) {
		int [] fs = {0,1,0,1,0,1};
		System.out.println(Arrays.toString(fs));
		int[] cs = swapArray(fs);
		System.out.println(Arrays.toString(cs));
		
	}

}
