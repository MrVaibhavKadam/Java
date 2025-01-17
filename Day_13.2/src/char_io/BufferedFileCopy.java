package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter source and destination file name");
		try (Scanner sc = new Scanner(System.in);
				// chain of I/O Streams to read the data:JA<--BR<--FR<-- SRC FileDevice
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				// chain of I/O Streams to write the
				// data:JA-->PrintWriter(PW)-->FW-->Destination Device
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(), true))) {
			String line=null;
			while((line=br.readLine())!=null)
				pw.println(line);
			System.out.println("File copy over..!");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
