package nested_class;

public class Outer {
   private int i;
   private static int j;
   static {
	    j=100;
   }
   
   public Outer(int i) {
	   super();
	   this.i=i;	   
   }
   //Static method
   public static void show()
   {
	   System.out.println("Outer's static method "+j);
	   //can you acces inner class's private members from outer class static method?--YES
	   //How:Create outer class instance n within such an enclosing instance create inner class instance.
	   Outer outer=new Outer(52);
	   Outer.Nested inner=outer.new Nested(21);
	   inner.displayInner();
	  
   }
   //Non-static (instance)method
   public void display()
   {
	   System.out.println("Outer's non-static method "+i);
	   //can you access inner class private members from outer's display?=YES.
	   //by creating inner class instance
	   Nested ref=new Nested(12);
	   System.out.println(ref.l+"Static member "+Nested.k);
   }
   //non-static nested class:Inner class
   public class Nested
   {
	   //can contain only non static members.for static Only  static constants are allowed.
	   private static final int k=100;
	   private int l;
//	   can't contain any static block
//	   static {k=100;}
	   //constructor
	   public Nested(int l)
	   {
		   super();
		   this.l=l;
	   }
//	   
//	   public static void test() {}
//	   can contains static methods.
//	   
	   //non static method
	   public void displayInner()
	   {
		   //Inner class can access All the members of outer class directly.
		   System.out.println("Via display inner: "+i+" "+j+" "+k+" "+l);
		   
	   }
   }
}
