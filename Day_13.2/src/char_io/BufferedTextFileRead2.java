package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileRead2 {

	public static void main(String[] args) {
		// read data from text file using buffer, till end of file.
		System.out.println("Enter name and path of the file-> ");
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
			System.out.println("File read over ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over..!");

	}

}
