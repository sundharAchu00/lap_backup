package arrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the path");
		String path=s.nextLine();
		File f1=new File(path);

		try {
			if (f1.createNewFile()) {
				System.out.println("success");
			} else {
				System.out.println("failed");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
