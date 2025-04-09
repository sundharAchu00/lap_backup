package upCastingApplication;
import java.util.Scanner;
class Ball {
	private double radius;

	Ball() {
	}

	Ball(double radius) {
		this.radius = radius;
	}

	public void getRadius() {
		System.out.println("radius :" + radius);
	}

	public void setRadius(double ra) {
		radius = ra;
	}
}

class BasketBall extends Ball {
	String game = "BasketBall";

	BasketBall() {
		super(20);
		// li
	}
}

class TennisBall extends Ball {
	String game = "TennisBall";

	TennisBall() {
		super(15);
	}
}

class Bag {
	Ball b;
	Bag(){}
	public void addBall(Ball ball) {
		if(b==null) {//bag is empty
			b=ball;
			String res=showgame();
			System.out.println("Ball is Added........"+res);
		}else {//bag is not empty
			System.out.println("ball is a Already Exist");
		}
	}
	public void removeBall() {
		if(b!=null) {
			b=null;
			System.out.println("Ball is removed........");
		}else {
			System.out.println("Bag is Empty........");
		}
	}
	public String showgame(){
		if(b==null)
			return "no ball is there Bag";
		else if(b instanceof BasketBall) {
			BasketBall bas=(BasketBall)b;
			return bas.game;
		}else if(b instanceof TennisBall){
			TennisBall ten=(TennisBall)b;
			return ten.game;
		}
		else 
			return "";
	}
	public boolean isBagEmpty() {
		if(b==null) {
			return false;//bag is empty
		}else {
			return true;//bag is not empty
		}
	}
}
public class UserInterface {
	static Scanner s=new Scanner(System.in);
	static Bag bag=new Bag();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean b=true;
		 do {
			 System.out.println("\t\t\tSelect the input");
			 System.out.println("\t\t1.ADD BALL\n\t\t2.REMOVE BALL\n\t\t3.CHECK BAG IS EMPTY OR NOT\n\t\t4.SHOW GAME THAT CAN BE PLAYED\n\t\t5.EXIT");
			 int user_input=s.nextInt();
			 switch (user_input) {
			 case 1:{
				 boolean b1=true;
				do {
				 System.out.println("\t\t\tSelect the input");
				 System.out.println("\t\t1.Basket Ball\n\t\t2.Tennis Ball\n\t\t3.Exit");
				 int input=s.nextInt();
				 if(input==1) {
					 bag.addBall(new BasketBall());
				 }else if(input==2){
					 bag.addBall(new TennisBall());
				 }else if(input==3) {
					 b1=false;
				 }
				}while(b1);
				 break;}
			 case 2:{
				 bag.removeBall();
				 break;}
			 case 3:{
				 if(bag.isBagEmpty()) {
					 System.out.println("Bag is Not Empty........");
				 }else {
					 System.out.println("Bag is Empty........");
				 }
				 break;}
			 case 4:{
				 System.out.println(bag.showgame());
				 break;}
			 case 5:{
				 b=false;
				 break;}
			 default:{
				 System.out.println("Lee user Select from the given input....");
				 break;}
			 }
			 
		 }while(b);
	}

}
