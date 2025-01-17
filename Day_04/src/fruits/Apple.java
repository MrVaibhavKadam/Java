package fruits;

public class Apple extends Fruit {
	public Apple(String name) {
		super(name); 
	}
  public void taste() {
	  System.out.println(getName()+"has sweet and sour taste.");
  }
  public void jam() {
	  System.out.println("making jam of "+ getName());
  }
}
