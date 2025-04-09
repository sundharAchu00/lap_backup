package arrays;

import java.util.Arrays;

public class ListObjectDriver {

	public static void main(String[] args) {
		Object a[] = new Object[9];
		a[0] = new LaptopForArray("dell", 45000);
		a[5] = new LaptopForArray("Asus", 35000);
		a[8] = new LaptopForArray("Apple", 85000);

		a[2] = new EmplyeeForArray(121, "jagan", 34000);
		a[3] = new EmplyeeForArray(122, "yuvaraj", 22000);
		a[6] = new EmplyeeForArray(123, "watson", 25000);

		a[1] = new StudentForArray(11, "dinesh", 80);
		a[7] = new StudentForArray(12, "yadesh", 34);
		a[4] = new StudentForArray(13, "manish", 78);
		
		int s_count = 0, l_count = 0, e_count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof StudentForArray) {
				s_count++;
			} else if (a[i] instanceof EmplyeeForArray) {
				e_count++;
			} else {
				l_count++;
			}
		}

		StudentForArray[] s = new StudentForArray[s_count];
		EmplyeeForArray[] e = new EmplyeeForArray[e_count];
		LaptopForArray[] l = new LaptopForArray[l_count];

		for (int i = 0,j=0,k=0,m=0; i < a.length; i++) {
			if (a[i] instanceof StudentForArray) {
				 s[j++] = (StudentForArray) a[i];
//				System.out.println(s[j]);
				
			} else if (a[i] instanceof EmplyeeForArray) {
				e[k++] = (EmplyeeForArray) a[i];
				
			} else if (a[i] instanceof LaptopForArray) {
				l[m++] = (LaptopForArray) a[i];
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof StudentForArray) {
				StudentForArray ref = (StudentForArray) a[i];
				if (ref.marks < 35) {
					System.out.println(a[i]);
				}
			} else if (a[i] instanceof EmplyeeForArray) {
				EmplyeeForArray ref1 = (EmplyeeForArray) a[i];
				if (ref1.sal < 25000) {
					System.out.println(a[i]);
				}
			} else if (a[i] instanceof LaptopForArray) {
				LaptopForArray ref2 = (LaptopForArray) a[i];
				if (ref2.price < 50000) {
					System.out.println(a[i]);
				}
			}
		}
		System.out.println("\n\n**********The Object Details are**************");
		System.out.println(" \n"+Arrays.toString(s));
		System.out.println("************************");
		System.out.println("\n"+Arrays.toString(e));
		System.out.println("************************");
		System.out.println("\n"+Arrays.toString(l));
	}
}
