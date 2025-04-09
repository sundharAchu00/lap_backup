package objectclass;

public class Marker {
	String name="camelin",color="red";
	public String toString() {
		return name+":"+color;
	}
	public static void main(String[] args) {
		Marker m1=new Marker();
		System.out.println(m1);
	}
}
