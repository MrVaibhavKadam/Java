import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopy {
	public static void main(String[] args) {
		System.out.println("Enter Source And Destination file Name:");
		try(Scanner sc = new Scanner(System.in);
			//chain of I/O streams to read data:JA<--BR<--FR<--File Device.
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
			//Chain of I/O stream to write data:JA-->PW--->FR---->Destination file.
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(),true))//inner True is for append.
				){
			String line = null;
			while((line = br.readLine())!= null) {
				pw.println(line);
			}
			System.out.println("File Copied..!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
