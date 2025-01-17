package lists;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		//Create EMPTY arraylist to store integer type of refs.
		ArrayList<Integer>integerList=new ArrayList<>();
		System.out.println("size "+integerList.size());
		int[]data= {34,26,85,45,61,25,42,101,99,101};//Sample data.
		//how to populate AL from sample data
		//for/for-each
		for(int i:data)//i=data[0]...i=data[data.length-1]
			integerList.add(i);//javac:autoboxing:integerList.add(new Integer(i));
		System.out.println("List Content "+integerList);
		System.out.println("size "+integerList.size());

	}

}
