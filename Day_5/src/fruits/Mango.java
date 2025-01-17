package fruits;

public class Mango extends Fruit {
	public Mango(String name) {
		super(name); 
	}
  public void taste() {
	  System.out.println(getName()+" has sweet taste.");
  }
  public void pulp() {
	  System.out.println("making pulp of "+ getName());
  }
}
