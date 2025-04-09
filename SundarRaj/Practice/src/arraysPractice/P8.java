package arraysPractice;

public class P8 {

	public static void main(String[] args) {
		int a[]= {2,1,3,5,8,4,7,9,10},count=1,max=1,maxlength=0;
		for (int i = 1; i < a.length; i++) {
			if (a[i]>a[i-1]) {
				count++;
			} else {
				if (max<count) {
					max=count;
					maxlength=i-max;
				}
				count=1;
			}
			if (max < count) {
				max=count;
				maxlength=a.length-max;
			}
		}
		for (int i = maxlength; i < max+maxlength; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
