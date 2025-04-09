package relaionship;

import java.util.*;

public class Bag {
	String color;
	double price;
	Book b;

	Bag(String col, double pri) {
		color = col;
		price = pri;
	}

	public void addBook(String bok, int id, double pri) {
		b = new Book(bok, id, pri);
		System.out.println("Book is Added.............");
	}

	public void removeBook() {
		b = null;
		System.out.println("Book is Removed.......................");
	}

	public void getBookName() {
		if (b != null) {
			System.out.println(b.book_name);
		} else {
			System.out.println("No Book Found..........");
		}
	}
}

class Book {
	String book_name;
	int book_id;
	double price;

	Book(String bok, int id, double pri) {
		book_name = bok;
		book_id = id;
		price = pri;
	}
}

class bookDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Bag Color");
		String col = sc.nextLine();
		System.out.println("Enter Bag Price");
		double pri = sc.nextDouble();
		Bag bg = new Bag(col, pri);
		boolean b = true;
		do {
			System.out.println("1.add book\n2.remove book\n3.Get Book Name\n4.Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1: {
				System.out.println("enter Book Name ");
				sc.nextLine();
				String Book = sc.nextLine();
				System.out.println("enter Book ID ");
				int id = sc.nextInt();
				System.out.println("Enter Book Price");
				double price = sc.nextDouble();
				System.out.println("********************************");
				bg.addBook(Book, id, price);
				break;
			}
			case 2: {
				bg.removeBook();
				break;
			}
			case 3: {
				bg.getBookName();
				break;
			}
			case 4: {
				b = false;
				break;
			}
			default: {
				System.out.println("out of range..........");
				break;
			}
			}
		} while (b);
	}
}
