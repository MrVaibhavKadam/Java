package streams_practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssignmentNew {

	public static void main(String[] args) {
		
		String originalString = "JavaJ2eeStrutsHibernate";
		String rotatedString = "StrutsHibernateJavaJ2ee";
		
		if (originalString.length() != rotatedString.length()) {
			System.out.println(originalString + " is not equal to " + rotatedString);
			return;
		}	
		String s1 = originalString.chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
		
		String s2 =  rotatedString.chars().sorted().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
		
		System.out.println(s1.equals(s2));
		//Second way
		
		String concatenatedString = originalString + originalString;
		
		if (concatenatedString.contains(rotatedString)) {
            System.out.println(rotatedString + " is a rotation of " + originalString);
        } else {
            System.out.println(rotatedString + " is NOT a rotation of " + originalString);
        }
		
		
		
		 if (originalString.length() == rotatedString.length()) {
	      
		  boolean anyMatch = Stream.of(concatenatedString).anyMatch(s3 -> s3.contains(rotatedString));
          System.out.println("Is the another string is rotation of original: " + anyMatch);
         } else {
        	System.out.println("Both strings are different."); 
		}

		 
	}
	
	

}
