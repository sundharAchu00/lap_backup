package arrays;

import java.util.Arrays;

public class LargestArray {

	public static void main(String[] args) {
		int arr[]= {122,199,685,999,173,168};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
