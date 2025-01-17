package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.app.core.Student;
public class BinIOUtils {
//Add a static method to write 1 student details to binary file.
	public static void saveStudentDetails(Student s, String fileName) throws IOException {
		// chain of streams JA-->DOS-->BOS-->FOS-->(bINARY FILE)
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))) {
			// write student info.:int rollNo, String name,localdate dob, Subject currentSubject,double gpa:Using single write operation.
			out.writeObject(s);
			
		}

	}
	public static void saveStudentMapDetails(HashMap<Integer, Student> map, String fileName) throws IOException {
		// chain of streams JA-->DOS-->BOS-->FOS-->(bINARY FILE)
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName))) {
			// write map of students 
			out.writeObject(map);//JVM checks for serializability of the entire obj graph: if it encounters any non-serializiable node: entire serialization fails:exc-java.io.NotserializableException.
			
			
		}

	}

	// Add a static method to read Map of student details from binary file.
	@SuppressWarnings("unchecked")
	public static HashMap<Integer, Student> restoreStudentDetails(String fileName) throws IOException, ClassNotFoundException {
		// How to validate file:Exists or not, file, read permission
		// Checked via java.io.File class:represents a path to file or folder.
		// 1.Create file class instance
		// public File(String pathname)
		File f1 = new File(fileName);
		if (f1.exists() && f1.canRead() && f1.isFile()) {
			//Readable data file exists
			// chain of strms: JA<--OIS<--<--FIS<--BIN FILE
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
				return (HashMap<Integer, Student>)in.readObject();
				

			}
		}
		//In case if file doesn't exists:Return empty Map
		return new HashMap<>();

	}
}
