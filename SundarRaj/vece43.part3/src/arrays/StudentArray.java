package arrays;

//Q11.wajp to create student array and print only those student details who is failed
class Student{
	int id;
	String name;
	double marks;
	Student(){}
	Student(int id,String name,double mark){
		this.id=id;
		this.name=name;
		marks=mark;
	}
	@Override
	public String toString() {
		return "Student id= " + id + "\n name= " + name + "\n marks= " + marks ;
	}
}
public class StudentArray {

	public static void main(String[] args) {
	 Student stu[]=new Student[6];
	 stu[0]=new Student(101,"jagan",34);
	 stu[1]=new Student(102,"dinesh",64);
	 stu[2]=new Student(103,"yuvaraj",84);
	 stu[3]=new Student(104,"navilan",94);
	 stu[4]=new Student(105,"dinga",30);
	 stu[5]=new Student(106,"dingi",91);
//	 System.out.println(Arrays.toString(stu));
	 for (int i = 0; i < stu.length; i++) {
		if (stu[i].marks<35) {
			System.out.println(stu[i]);
		}
	}
	}

}
