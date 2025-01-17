import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedTextFileRead2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//Read data from text file using buffer, till EOF.
		System.out.println("Enter Name Along with path of the file to read.");
//		try(Scanner sc = new Scanner(System.in);
//				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))
//				){
//			//reading data from buffer of BR
//			System.out.println("Printing file content:via lambda Expression ");
//			br.lines()//Stream <String>:line from a buffer.
//			.forEach(l -> System.out.println(l));//buffer reader ne ekada read kela aahe aata te last point la aahe mhanje end la aahe 
//												 //mhanun aapan je method reference ne print kel aahe tithe kahi cha print honar nahi tar 
//												 //print karnyasathi aaplyala BR start la join karav lagal. Tyasathi aaplyala parat BR cha 
//												 //instance karav lagel.
//			try(BufferedReader br1 = new BufferedReader(new FileReader(sc.nextLine()))){
//				System.out.println("Printing file content:via method reference");
//				br1.lines().forEach(System.out::println);
//				System.out.println("File reading is over..!");//this should not give any output because still br is at the End Of The file.
//			} for working both we have to use below try-with-resources.
//			
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		try (Scanner sc = new Scanner(System.in)) {
            // Get the file path
            String filePath = sc.nextLine();

            // Outer try-with-resources
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                System.out.println("\n[Using BufferedReader with Lambda Expression]");
                br.lines().forEach(line -> System.out.println(line));
            }

            // Inner try-with-resources with reinitialized BufferedReader
            try (BufferedReader br1 = new BufferedReader(new FileReader(filePath))) {
                System.out.println("\n[Using BufferedReader with Method Reference]");
                br1.lines().forEach(System.out::println);
                System.out.println("File reading is over!");
            }
		}
		System.out.println("File Read Over..!");
	}

}
