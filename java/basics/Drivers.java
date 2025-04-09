class classRoom
{
	int cls_no;
	Projector p;
	classRoom(int cls){
		cls_no=cls;
	}
	public void getProject(Projector p){
		System.out.println("class room no :"+cls_no);
		System.out.println("class room Projector number :"+p.pro_no);
	}
}
class Projector
{
	int pro_no;
	Projector(int pro){
		pro_no=pro;
	}
}

class Drivers 
{
	public static void main(String[] args) 
	{
		classRoom c1=new classRoom(8);
		//System.out.println("class room number :"+c1.cls_no);
		//System.out.println("*****************************");
		c1.getProject(new Projector(4));
	}
}
