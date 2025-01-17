package test_enum;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Display all directions");
			for(Direction d:Direction.values()) 
				System.out.println(d);//calls toString enum's
			System.out.println("Choose a direction:String");
			//convert it to the enums
			Direction d1=Direction.valueOf(sc.next().toUpperCase());
			System.out.println("Choosen Direction "+d1);
			//switch case with enum's
			switch (d1) {
			case EAST:
				System.out.println("1");
				break;

			case WEST:
				System.out.println("2");
				break;
			case SOUTH:
				System.out.println("3");
				break;
			case NORTH:
				System.out.println("4");
				break;	
			}
			
		}

	}

}
