package bin_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/*Objective:Hoe to read the data from a binary file in buffered mode till EOF ?
 * Create byte[] sufficiently large to hold file's available data
 * and read in single operation
 * 
 * */
public class BinFileRead {
	

	public static void main(String[] args) {
		System.out.println("Enter Binary file name to read data-->");
		try(Scanner sc=new Scanner(System.in);
				//Java App<--BufferedInputStream<---FileInputStream<--BinaryFile
				BufferedInputStream in=new BufferedInputStream(new FileInputStream(sc.nextLine()))
				) {
			//To read the data from buffer of BIS
			//check how many bytes are available?
			int availableBytes = in.available();
			//create byte[]
			byte[] binary=new byte[availableBytes];
			System.out.println("No of Bytes read "+in.read(binary));
			System.out.println("Printing binary data");
			System.out.println(Arrays.toString(binary));
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
