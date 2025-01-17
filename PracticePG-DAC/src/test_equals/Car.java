package test_equals;

public class Car {
	private int regNo;
	private String color;
	private double price;
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
	}
	
	public Car(int regNo, String color, double price) {
		super();
		this.regNo = regNo;
		this.color = color;
		this.price = price;
	}
	//override equals method inherited from object class to replace reference equality with 
	//content equality
	@Override // detects the error at compile time
	public boolean equals(Object o) {
		System.out.println("in car equals");
		if(o instanceof Car) {
		Car car = (Car) o;//DownCasting.
		return this.regNo == car.regNo;
		}
		return false;
	}
	
	

}
