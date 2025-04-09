package file_handling;

import java.util.Scanner;
import java.io.*;

public class WritingFile {
	static Scanner s=new Scanner(System.in);
	static OutputStream fout;
	public static void main(String[] args) {
		System.out.println("enter the Path....");
		String path=s.nextLine();
		try {
			fout = new FileOutputStream(path);
			System.out.println("Enter the data");
			String data=s.nextLine();
			fout.write(data.getBytes());
			System.out.println("Done................");
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println("ceck the path....");
			}
	}

}
