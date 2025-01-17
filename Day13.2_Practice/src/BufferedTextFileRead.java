import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileRead {

	public static void main(String[] args) {
		//Read data from text file using buffer, till EOF.
		System.out.println("Enter Name Along with path of the file to read.");
		try(Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))
				){
			//reading data from buffer of BR
			String line = null;
			System.out.println("Printing file content: ");
			while((line = br.readLine())!= null) {
				System.out.println(line);
				System.out.println("File Read Over.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
