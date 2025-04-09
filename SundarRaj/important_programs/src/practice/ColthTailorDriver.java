package practice;

abstract class ClothShop{//Service specifier
//	abstract public static void m1();
	abstract public void slimFit();
	abstract public void chineseCollar();
	abstract public void twoPockets();
}
class Tailor extends ClothShop{//Service provider
	@Override
	public void slimFit() {
		System.out.println("here is your slimfit shirt");
	}
	@Override
	public void chineseCollar() {
		System.out.println("here is your Chinese_Collar shirt");
	}
	@Override
	public void twoPockets() {
		System.out.println("here is your Two Pocket shirt");
	}
	
}
public class ColthTailorDriver {//end user

	public static void main(String[] args) {
		ClothShop ref=new Tailor();
		ref.slimFit();
		ref.chineseCollar();
		ref.twoPockets();
	}

}
