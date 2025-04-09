package is_a_relaionship;

class p1{
static int a=89;	
}
class p2 extends p1{
static int b=20;	
}
public class MultiLevel extends p2 {
	static int c=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(MultiLevel.b);
		System.out.println(c);
		
	}

}
