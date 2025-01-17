package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.app.core.Student;
import static java.time.LocalDate.*;
import static com.app.core.Subject.*;
public class BinIOUtils {
//Add a static method to write 1 student details to binary file.
	public static void saveStudentDetails(Student s, String fileName) throws IOException {
		// chain of streams JA-->DOS-->BOS-->FOS-->(bINARY FILE)
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			// write student info.:int rollNo, String name,localdate dob,..etc
			out.writeInt(s.getRollNo());//
			out.writeUTF(s.getName());
			out.writeUTF(s.getDob().toString());// dob-->string-->UTF8
			out.writeUTF(s.getCurrentSubject().toString());
			out.writeDouble(s.getGpa());
		}

	}

	// Add a static method to read 1 student details from binary file.
	public static Student restoreStudentDetails(String fileName) throws IOException {
		// How to validate file:Exists or not, file, read permission
		// Checked via java.io.File class:represents a path to file or folder.
		// 1.Create file class instance
		// public File(String pathname)
		File f1 = new File(fileName);
		if (f1.exists() && f1.canRead() && f1.isFile()) {
			//Readable data file exists
			// chain of strms: JA<--DIS<--BIS<--FIS<--BIN FILE
			try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
				return new Student(in.readInt(), in.readUTF(), parse(in.readUTF()), valueOf(in.readUTF()), in.readDouble());
				

			}
		}
		return null;

	}
}
