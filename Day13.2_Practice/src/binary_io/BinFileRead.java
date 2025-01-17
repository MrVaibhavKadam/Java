package binary_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class BinFileRead {
	public static void main(String[] args) {
		System.out.println("Enter Binary File name to read data from:");
		
		try(Scanner sc = new Scanner(System.in);
				//Java App <--- BinInputStream <--- FileInputStream <--- Bin file
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sc.nextLine()))
 				){
			//to read data from buffer of BIS: in single operation.
			//first check how many bytes are available->
			int availableBytes = bin.available();
			//Create byte array of that size->
			byte [] buffer = new byte[availableBytes];
			//then use method .read(byte[] b)
			System.out.println("No. of Bytes Read: "+bin.read(buffer));
			System.out.println("Printing Bin data: ");
			System.out.println(Arrays.toString(buffer));
			System.out.println("Binary Data Read Over..!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
