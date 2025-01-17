package fruits;

public class Fruit {
	public String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	//Add  Taste method too super class
	public void taste() {
		System.out.println("No specific taste..!");
	}
	public String getName() {
		return name;
	}

}
