package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class BinIOUtils {

	// Add a static method to read Map of student details from binary file.
	@SuppressWarnings("unchecked")
	public static Object  restoreStudentDetails(String fileName) throws IOException, ClassNotFoundException {
		// How to validate file:Exists or not, file, read permission
		// Checked via java.io.File class:represents a path to file or folder.
		// 1.Create file class instance
		// public File(String pathname)
		File f1 = new File(fileName);
		if (f1.exists() && f1.canRead() && f1.isFile()) {
			//Readable data file exists
			// chain of strms: JA<--OIS<--<--FIS<--BIN FILE
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
				return in.readObject();
				

			}
		}
		//In case if file doesn't exists:Return Null
		return null;

	}
}
