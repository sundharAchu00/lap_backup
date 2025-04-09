package exception;

import java.util.Scanner;

public class Color {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter color");
		String color=s.next();
		getTeam(color);
//		try {
//			getTeam(color);
//		} catch (CskException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RcbException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	
	public static void getTeam(String color) {
		if(color.equals("yellow")) {
			try {
			throw new CskException();
			}
			catch(CskException c) {
				System.out.println("This is Anbuden");
			}
			}
		else if(color.equals("red")) {
		try {
			throw new RcbException();
		}
		catch(RcbException r) {
			System.out.println("This Kohli's Kingdom");
		}
		}
		else
			System.out.println("sorry data not found");
	}
}
