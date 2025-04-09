package file_handling;

import java.io.File;
import java.util.Scanner;

public class CreatingFile {
 static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the path");
		String path=s.nextLine();
		File f=new File(path);
		try {
			if (f.createNewFile()) {
				System.out.println("file created successfully......");
			} else {
				System.out.println("Check the path......");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
