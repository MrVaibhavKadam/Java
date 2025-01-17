package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileRead {

	public static void main(String[] args) {
		// read data from text file using buffer, till end of file.
		System.out.println("Enter name and path of the file-> ");
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {

			System.out.println("Printing file content via lambda exp. ");
			br.lines()//return Stream<Strings>:Line from a buffer
			.forEach(l->System.out.println(l));
			System.out.println("Printing file content via method ref.");
			br.lines().forEach(System.out::println);
//			The method reference in the code is indeed working correctly, but the problem is
//			that you are not seeing any output when using a method reference. This is due to the
//          fact that the BufferedReader.lines() method returns a stream of lines, and when you use the forEach() method with a method reference, the lines are processed and printed but not displayed immediately.
//
//			The issue is related to the way the console handles input and output. The console might not
//			display the output when using the method reference due to buffering. In other words, the output is not immediately flushed, so you don't see it in the console.
//
//			To fix this issue, you can add a call to System.out.flush() after the forEach() method with the method reference.
//			This will ensure that the output buffer is flushed, and you'll see the output in the console.
     		System.out.flush();
			System.out.println("File read over ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main over..!");

	}

}
