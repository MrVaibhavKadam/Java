package nested_class2;

public class Outer {
	private int i=100;

	public static void main(String[] args) {
		//How to invoke show method?
		Outer.Inner innerRef=new Outer().new Inner();
		innerRef.show(300);

	}
	class Inner{
		private int i=200;
		void show(int i) {
			//display 300,200,100
			System.out.println("Methos local variable "+i);
			System.out.println("instance variable "+this.i);
			System.out.println("Outer i "+Outer.this.i);
			
			
		}
		
	}

}
