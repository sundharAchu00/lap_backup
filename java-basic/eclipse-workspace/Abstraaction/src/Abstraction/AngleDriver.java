package Abstraction;

abstract class Shape {
	String name;

	Shape() {
	}

	Shape(String name) {
		this.name = name;
	}

	abstract void draw();

	abstract void name();
}

class Rectangle extends Shape {
	String name;

	Rectangle() {
	}

	Rectangle(String name) {
		super(name);
		this.name = name;
	}

	void draw() {
		System.out.println("this is Drawn by : " + name);
	}

	void name() {
		System.out.println("The Name is : " + name);
	}
}

class Triangle extends Shape {
	String name;

	Triangle() {
	}

	Triangle(String name) {
		super(name);
		this.name = name;
	}

	void draw() {
		System.out.println("this is Drawn by : " + name);
	}

	void name() {
		System.out.println("The Name is : " + name);
	}
}

public class AngleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Rectangle("Rectangle");
		s1.draw();
		s1.name();
		Shape s2 = new Rectangle("Triangle");
		s2.draw();
		s2.name();

	}

}
