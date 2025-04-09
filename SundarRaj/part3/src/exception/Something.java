package exception;

import java.util.Scanner;

public class Something {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws CskException, RcbException {
		// TODO Auto-generated method stub
		System.out.println("enter color");
		String color=s.next();
	
		getTeam(color);
		
	}
	public static void getTeam(String color) throws CskException, RcbException {
		if(color.equals("yellow")) {
			throw new CskException();
		}
			
		else if(color.equals("red")) {
			throw new RcbException();
		}
		else
			System.out.println("sorry data not found");
	}
}
