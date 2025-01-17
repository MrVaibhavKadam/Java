package fruits;

public class Orange extends Fruit {
	public Orange(String name) {
		super(name); 
	}
  public void taste() {
	  System.out.println(getName()+" has sour taste.");
  }
  public void juice() {
	  System.out.println("extracting juice of "+ getName());
  }
}
