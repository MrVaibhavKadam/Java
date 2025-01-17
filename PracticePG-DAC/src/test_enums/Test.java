package test_enums;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Display all directions");
			for (Direction d : Direction.values()) {
				System.out.println(d);//calling toString() of Enum.
			}//If we want all the directions names in lowercase we have to override toString() in Direction.
			
			System.out.println("Choose a direction: String");
			//convert it to the enum:
			Direction d1 = Direction.valueOf(sc.next().toUpperCase());
			System.out.println("Choosen Direction : "+ d1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
