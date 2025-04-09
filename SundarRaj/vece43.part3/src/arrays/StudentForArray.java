package arrays;

public class StudentForArray {
	int id;
	String name;
	double marks;
	StudentForArray(){}
	StudentForArray(int id,String name,double mark){
		this.id=id;
		this.name=name;
		marks=mark;
	}
	@Override
	public String toString() {
		return "\nStudent [id= " + id + ", name= " + name + ", marks= " + marks+"]" ;
	}
}
