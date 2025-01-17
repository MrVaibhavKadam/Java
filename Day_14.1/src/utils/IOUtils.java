package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import com.app.core.Student;

public class IOUtils {
	public static void saveStudentDetails(HashMap<Integer, Student>studentMap,String fileName)throws IOException {
		//chain of I/O streams
		try (PrintWriter pw=new PrintWriter(new FileWriter(fileName))){
			for(Student s:studentMap.values())
				pw.println(s+"\n");
			//OR
		//	studentMap.forEach((i,s)->pw.println(s));
			
		}
	}

}
