
class Animal{
	String name,type;
	Animal(){}
	Animal(String nam,String ty){
		name=nam;
		type=ty;
	}
	public void doAnimal(){
		System.out.println("name :"+name);
		System.out.println("Type :"+type);
		System.out.println("******************************");
		
	}
}
class Dinga extends Animal{
	String grl_name;
	Dinga(){}
	Dinga (String gf){
		super("ZIbra","Herbivores");
		grl_name=gf;
	}
	public void callParent() {
		super.doAnimal();
	}
}
class Dingi extends Animal{
	String bof;
	Dingi(){}
	Dingi(String bf){
		super("Tiger","Carnivores");
		bof=bf;
	}
	public void callParent() {
		super.doAnimal();
	}
}
public class DriverAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dingi d1=new Dingi("dinga");
		Dinga d2=new Dinga("dinga");
		d1.callParent();
		d2.callParent();
	}
}
