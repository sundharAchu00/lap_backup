package arrays;

import java.util.Arrays;

public class MergingArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int b[] = { 50, 60, 70 };
		int res[] = new int[a.length + b.length];
		for (int i = 0, m = 0, n = b.length - 1; i < res.length; i++) {
			if (m < a.length) {
				res[i] = a[m++];
			} else {
				res[i] = b[n--];
			}
		}
		System.out.println("the result is " + Arrays.toString(res));
	}

}
