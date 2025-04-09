package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectObject {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int s_count = 0, l_count = 0, e_count = 0;
		System.out.println("How Many Element do want to Store");
		int n = s.nextInt();
		Object o[] = new Object[n];
		int i = 0;
		System.out.println("Which Object do you want to Store...");
		boolean b = true;
		do {
			System.out.println("1.Student\n2.Staff\n3.Laptop\n4.Exit");
			int option = s.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter te Student ID : ");
				int id =ProjectObject.s.nextInt();
				System.out.println("Enter the student name : ");
				String name =ProjectObject.s.next();
				System.out.println("Enter the Student Marks");
				double mark =ProjectObject.s.nextDouble();
				o[i] = new StudentForArray(id, name, mark);
				s_count++;
				break;
			}

			case 2: {
				System.out.println("Enter te Employee ID : ");
				int eid =ProjectObject.s.nextInt();
				System.out.println("Enter the Employee name : ");
				String ename =ProjectObject. s.next();
				System.out.println("Enter the Employee Salary");
				double sal =ProjectObject. s.nextDouble();
				o[i] = new EmplyeeForArray(eid, ename, sal);
				e_count++;
				break;
			}

			case 3: {
				System.out.println("Enter the Laptop name : ");
				String name =ProjectObject.s.next();
				System.out.println("Enter the Laptop Price");
				double price =ProjectObject.s.nextDouble();
				o[i] = new LaptopForArray(name, price);
				l_count++;
				break;
			}

			case 4: {
				i += o.length;
				b = false;
				break;
			}
			default:
				System.out.println("Enter the value in range...." + (char) 3);
				break;
			}
			i++;
		} while (i < o.length);
		
		
//		System.out.println(Arrays.toString(o));

		// Storing Object to The Specific Container
		StudentForArray[] s = new StudentForArray[s_count];
		EmplyeeForArray[] e = new EmplyeeForArray[e_count];
		LaptopForArray[] l = new LaptopForArray[l_count];

		for (int j = 0, c = 0, k = 0, m = 0; j < o.length; j++) {
			if (o[j] instanceof StudentForArray) {
//				System.out.println("hello");
				s[c++] = (StudentForArray) o[j];
			}
			else if (o[j] instanceof EmplyeeForArray) {
//				System.out.println("hello");
				e[k++] = (EmplyeeForArray) o[j];
			}
			else if (o[j] instanceof LaptopForArray) {
//				System.out.println("hello");
				l[m++] = (LaptopForArray) o[j];
			}
		}
//		System.out.println(Arrays.toString(s));
//		System.out.println(Arrays.toString(e));
//		System.out.println(Arrays.toString(l));
		
		System.out.println();
		System.out.println("***************Details**************");
		boolean b1=true;
		do {
		System.out.println("Which Details Do You Want To Get");
		System.out.println("1.Students\n2.Emoployees\n3.Laptops\n4.Exit");
		int option=ProjectObject.s.nextInt();
		switch (option) {
		case 1:{
			System.out.println(Arrays.toString(s));
			System.out.println("***********************");
			boolean sb=true;
			System.out.println("Select The Filter");
			System.out.println("1.Passed Students\n2.Failed Students\n3.Exit");
			int selection=ProjectObject.s.nextInt();
			switch (selection) {
			case 1:{
				for (int j = 0; j < s.length; j++) {
					if(s[j].marks>=35) {
						System.out.println(s[j]);
					}	
				}
				break;}
			case 2:{
				for (int j = 0; j < s.length; j++) {
					if(s[j].marks<35) {
						System.out.println(s[j]);
					}
						
				}
				break;}
			case 3:{
				sb=false;
				break;}

			default:
				System.out.println("invalid Selction...........");
				break;
			}
			break;}
		case 2:{
			System.out.println(Arrays.toString(e));
			System.out.println("***********************");
			boolean sb=true;
			System.out.println("Select The Filter");
			System.out.println("1.Employee Salary < 20,000\n2.Employee Salary > 20,000\n3.Exit");
			int selection=ProjectObject.s.nextInt();
			switch (selection) {
			case 1:{
				for (int j = 0; j < e.length; j++) {
					if(e[j].sal<20000) {
//						System.out.println("hii");
						System.out.println(e[j]);
					}
						
				}
				break;}
			case 2:{
				for (int j = 0; j < e.length; j++) {
					if(e[j].sal>=20000) {
//						System.out.println("hii");
						System.out.println(e[j]);
					}
						
				}
				break;}
			case 3:{
				sb=false;
				break;}

			default:
				System.out.println("invalid Selction...........");
				break;
			}
			break;}
		case 3:{
			System.out.println(Arrays.toString(l));
			System.out.println("***********************");
			boolean sb=true;
			System.out.println("Select The Filter");
			System.out.println("1.Laptop Price < 20,000\n2.Laptop Price > 20,000\n3.Exit");
			int selection=ProjectObject.s.nextInt();
			switch (selection) {
			case 1:{
				for (int j = 0; j < l.length; j++) {
					if(l[j].price<=20000) {
						System.out.println(l[j]);
					}
						
				}
				break;}
			case 2:{
				for (int j = 0; j < l.length; j++) {
					if(l[j].price>20000) {
						System.out.println(l[j]);
					}
						
				}
				break;}
			case 3:{
				sb=false;
				break;}

			default:
				System.out.println("invalid Selction...........");
				break;
			}
			break;}
		case 4:{
			b1=false;
			System.out.println("***********Thank You*************");
			break;}

		default:
			System.out.println("invalid Selction..........");
			break;
		}
		} while (b1);
	}

}
