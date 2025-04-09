package polymorphism;

import java.util.*;

class EngProject {
	Scanner s = new Scanner(System.in);

	EngProject() {
	}

	public void xylem() {
		System.out.println("Enter a Multiple digit NUmber");
		int num = s.nextInt();
		int extresum = 0;
		int midsum = 0;
		for (int i = num; i != 0;) {
			if (i == num || i < 10) {
				extresum = extresum + i % 10;
			} else {
				midsum = midsum + i % 10;
			}
			i /= 10;
		}
		if (extresum == midsum) {
			System.out.println("The Given Number " + num + " : xylem");
		} else {
			System.out.println("The Given Number " + num + "is not a xylem");
		}
	}
}

class Engineer extends EngProject {
	String ename;
	int eage;

	Engineer() {
	}

	Engineer(String na, int ag) {
		ename = na;
		eage = ag;
	}

	public void xylem() {
		System.out.println("enter a number to check palindrome");
		int num = s.nextInt();
		int rev = 0;
		for (int i = num; i > 0; i /= 10)
			rev = (rev * 10) + (i % 10);
		if (rev == num)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}

class Student extends EngProject {
	String sname;
	int sage;

	Student() {
	}

	Student(String na, int ag) {
		sname = na;
		sage = ag;
	}

	public void xylem() {
		int fact = 1;
		System.out.println("Enter a Number to get Factorial");
		int num = s.nextInt();
		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial of the Number is " + fact);
	}
}

class Institute {
	String name, skill;
	Engineer e;
	Student s;

	Institute() {
	}

	Institute(String na, String sk) {
		name = na;
		skill = sk;
	}

	public void addStudent(Student su) {
		s = su;
		System.out.println("Student Added.........");
	}

	public void addEngineer(Engineer em) {
		e = em;
		System.out.println("Engineer Added.........");
	}
}

class Qspiders extends Institute {
	boolean isEngPre = e instanceof Engineer;
	boolean isStuPre = s instanceof Student;

	Qspiders() {
		super("Qspiders", "Manual Testing");
	}

	public void detOfQsp() {
		if (e instanceof Engineer) {
			System.out.println("the name is :" + name);
			System.out.println("the Skill is :" + skill);
			e.xylem();
		} else if (s instanceof Student) {
			System.out.println("the name is :" + name);
			System.out.println("the Skill is :" + skill);
			s.xylem();
		}
	}
}

class Jspiders extends Institute {
	Jspiders() {
		super("Jspiders", "Full-Stack Development");
	}

	public void detOfJsp() {
		if (e instanceof Engineer) {
			System.out.println("the name is :" + name);
			System.out.println("the Skill is :" + skill);
			e.xylem();
		} else if (s instanceof Student) {
			System.out.println("the name is :" + name);
			System.out.println("the Skill is :" + skill);
			s.xylem();
		}
	}
}

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute ref1 = new Qspiders();
		Qspiders ref2 = (Qspiders) ref1;
//		System.out.println("student present "+ref2.isStuPre);
//		System.out.println("Engineer present "+ref2.isEngPre);
		ref2.addStudent(new Student("sundhar", 22));
		ref2.detOfQsp();
		Institute ref3 = new Jspiders();
		Jspiders ref4 = (Jspiders) ref3;
		ref3.addEngineer(new Engineer("tabrez", 25));
		System.out.println(ref3.e.ename);
		ref4.detOfJsp();
		System.out.println("byee..........");
	}

}
