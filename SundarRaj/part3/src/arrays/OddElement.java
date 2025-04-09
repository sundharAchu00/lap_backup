package arrays;

public class OddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,5,6,7,8};
		for (int i = 0; i < num.length; i++) {
			if (num[i]%2==1) {
				System.out.println("The element "+num[i]+" is odd element");
				System.out.println();
			}
		}
	}

}
