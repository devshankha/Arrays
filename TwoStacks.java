import java.util.Arrays;

class LStack {

	int top;

	int[] arr;

	LStack(int[] a) {
		top = -1;
		arr = a;

	}

	void push(int e) {
		int temp = top + 1;
		if (arr[temp] != -1)
			return;

		arr[++top] = e;

	}

	int pop() {
		if (top == -1)
			return -1;
		int val = arr[top];
		arr[top--] = -1;
		return val;

	}

}

class HStack {
	int top;

	int[] arr;

	 HStack(int[] a) {
		arr = a;
		top = arr.length;

	}
	
	 void push(int e) {
		int temp = top - 1;
		if (arr[temp] != -1)
			return;

		arr[--top] = e;

	}

	int pop() {
		if (top == arr.length)
			return -1;
		int val = arr[top];
		arr[top] = -1;
		top++;
		return val;

	}

}

public class TwoStacks {
	private HStack hstack;
	private LStack lstack;
	int[] arr;
	
	public TwoStacks(int size) {
		arr = new int[size];
		Arrays.fill(arr, -1);
		hstack = new HStack(arr);
		lstack = new LStack(arr);
		
	}

	void push1(int x) {
		lstack.push(x);

	}

	void push2(int x) {
		hstack.push(x);

	}

	int pop1() {
		return lstack.pop();

	}

	int pop2() {
		return hstack.pop();

	}
	public static void main(String[] args) {
		TwoStacks s = new TwoStacks(5);
		s.push1(55);
		s.push1(48);
		s.push2(77);
		s.push2(97);
		
		System.out.println(s.pop1());
		System.out.println(s.pop2());
		System.out.println(s.pop2());
		System.out.println(s.pop2());
		System.out.println(s.pop1());
	}

}
