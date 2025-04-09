package arrays;

public class EmplyeeForArray {
	int eid;
	String ename;
	double sal;
	public EmplyeeForArray() {}
	public EmplyeeForArray(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "\nEmplyeeForArray [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
}
