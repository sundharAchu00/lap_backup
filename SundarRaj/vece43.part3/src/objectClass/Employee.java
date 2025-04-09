package objectClass;

public class Employee {
	int eid=12;
	String ename="sundhar";
	Employee(){}
	@Override
	public String toString() {
		return ename+"----->"+eid;
	}
	public static void main(String[] args) {
		Object e1=new Employee();
		System.out.println(e1);
	}
}
