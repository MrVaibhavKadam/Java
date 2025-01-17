package tester;
import java.util.Scanner;
import fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		System.out.println("Enter Basket size");//10
		Fruit[] basket=new Fruit[sc.nextInt()];//[Lfruits.Fruit:array object
		int counter =0;
		while (!exit) {
			System.out.println("Menu 1.Add Apple \r\n"+"2.Add Orange\r\n"+"3.Add Mango\r\n"+
		                  "4.Display taste of all fruits in basket(for-each)\r\n"+"5.Exit:Terminate the application");
			System.out.println("Choose option");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter Appl's name");
				if(counter<basket.length) {
					basket[counter++]=new Apple(sc.next());//up casting Apple-->Fruit
				}else
					System.out.println("Basket is full...!");
				break;
			case 2:	
				System.out.println("Enter Oranges name");
				if(counter<basket.length) {
					basket[counter++]=new Orange(sc.next());//up casting Orange-->Fruit
				}else
					System.out.println("Basket is full...!");
				break;
			case 3:
				System.out.println("Enter Mangoes name");
				if(counter<basket.length) {
					basket[counter++]=new Mango(sc.next());//up casting Mango-->Fruit
				}else
					System.out.println("Basket is full...!");
				break;
			case 4://Display taste of all fruits in basket
				System.out.println("Display fruit basket");
				for(Fruit f:basket)
	   				 if (f!=null) {
						 f.taste();//javac checks by the type of reference:Fruit
				                   //JVM checks by type of object:run time polymorphism
				if(f instanceof Apple)
					((Apple)f).jam();
				else if (f instanceof Orange)
					((Orange)f).juice();
				else
					((Mango)f).pulp();
				
	   				 }
				break;
			case 5:
				exit=true;
				break;
							
			}
		}
		
		sc.close();

	}

}
