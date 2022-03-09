package demo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		File myFile = new File("D:\\new.txt");
		System.out.println("Hello world");
		try {
			myFile.createNewFile();
			System.out.println("File created successfully.");
		} catch (IOException e) {
			System.out.println("Error occured.");
			e.printStackTrace();
		}
	}

}
