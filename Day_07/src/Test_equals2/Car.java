package Test_equals2;

public class Car {
  private int regNo;
  private String color;
  private double price;
  public Car(int regNo,String color,double price) {
	  super();
	  this.regNo=regNo;
	  this.color=color;
	  this.price=price;
  }
@Override //we need override classes to replace ref equality by unique id content equality
public String toString() {
	return "Car [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
}
//override the equals method inherited from the object class to replace the ref equality by the 
//content equality.(For that check the car's identity:Primary key(unique ID):regNo and color)
@Override
public boolean equals(Object o) //override version
{
	System.out.println("In car's equals");
	//Downcasting
	if(o instanceof Car) {
		Car c=(Car)o;
		return regNo==c.regNo && color.equals(c.color);
	}
	return false;
//In above "@override" and "InstanceOf" Both are IMP Without this we are not able to find the error.
//There is no runtime or compile time error but the output is different to avoid this we need to apply both "@override" and "InstanceOf".
//Below is overload method	
//public boolean equals(Car c) {
//	return this.regNo==regNo;
//}	
}
	
	

 
}
