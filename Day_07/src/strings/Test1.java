package strings;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		String s="Hello, how are you?";
		System.out.println(s.charAt(s.length()-1));
		String s1="Hello";
		String s2=s1.toUpperCase();//HELLO
		System.out.println(s1.compareTo(s2));
		int ch='e';
		int ch1='E';
		System.out.printf("%d%d%n",ch,ch1);
		//search for keyword
		String key="java";
		String ss="strings in the java are cool.String buffer is mutable string.";
		System.out.println(ss.contains(key));
		System.out.println(ss.startsWith("str")+" "+ss.endsWith("!"));
		System.out.println(ss.substring(2,9));//ring i
		String test="abd:bgss:2541:36asd:vsef";
		String []tokens=test.split("3");
		//how to display these tokens?w/o using any loop
		System.out.println(tokens);//hashcode value of array object
		System.out.println("Tokens");
		System.out.println(Arrays.toString(tokens));
		System.out.println(ss.indexOf("string")+" "+ss.lastIndexOf("."));
		
	}

}
