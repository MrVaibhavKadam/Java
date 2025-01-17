package lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ListConversionToArray {

	public static void main(String[] args) {
		ArrayList<String>strings=new ArrayList<>();
		strings.add("asd");
		strings.add("vfs");
		strings.add("nvhh");
		strings.add("hdbd");
		strings.add("nfdh");
		strings.add("yroo");
		//convert above to fixed size array.
		String[]ss=new String[strings.size()];//Array obj:6 nulls
		System.out.println("array befor "+Arrays.toString(ss));
		ss=strings.toArray(ss);
		System.out.println("array after "+Arrays.toString(ss));
		

	}

}
