package arrays;

public class LargestElement {

	public static void main(String[] args) {
		int b[]= {1,2,3,4,5};
		int i=0;
		if (b[i]>b[i+1]&&b[i]>b[i+2]&&b[i]>b[i+3]&&b[i]>b[i+4]) { 
			System.out.println(b[i]+" is the largest");
		}else if(b[i+1]>b[i+2]&&b[i+1]>b[i+3]&&b[i+1]>b[i+4]){
			System.out.println(b[i+1]+" is the largest");
		}else if(b[i+2]>b[i+3]&&b[i+2]>b[i+4]) {
			System.out.println(b[i+2]+" is the largest");
		}else if(b[i+3]>b[i+4]) {
			System.out.println(b[i+3]+" is the largest");
		}else {
			System.out.println(b[i+4]+" is the largest");
		}
	}

}
