package var_args;

public class Test {
	
	private static void displayDetails(Animal... animals) {
		for (Animal a : animals) {
			System.out.println(a);//calling toString method of the object class.
		}
	}

	public static void main(String... args) {
		
		System.out.println("Displaying details");
		displayDetails();//no error
		
		Animal[] animals = {new Dog(),new Cat(),new Horse()};
		displayDetails(animals);
		
		displayDetails(new Dog(),new Cat(),new Horse());
		

	}

}

class Animal{
	
}

class Dog extends Animal{
	
}

class Horse extends Animal{
	
}

class Cat extends Animal{
	
}
