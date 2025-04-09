package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Characterstream {
	static Scanner s=new Scanner(System.in);
	static Writer fw;
	public static void main(String[] args) throws IOException {
		System.out.println("enter the path...");
		String path=s.nextLine();
		fw=new FileWriter(path);
		System.out.println("enter the data");
		String data=s.nextLine();
		fw.write(data);
		System.out.println("done........");
		fw.flush();
		fw.close();

	}

}
