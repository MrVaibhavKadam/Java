package p2;

public class Tester {

	public static void main(String[] args) {
		//Direct referencing
//		MyComputable c1=new MyComputable();
//		System.out.println(c1.compute(20, 300));
		//indirect referencing: interface
		//i/f can't be instantiated
		//i/f ref can DIRECTLY (without(w/o)type casting)refers to any implementation class(IS-A)relationship.
		Computable ref;
		ref=new MyComputable();//up casting
		System.out.println(ref.compute(10,20));//javac resolves it by type of ref:computable
		//JVM:for virtual(non-static, non-private,not-final ) methods: resolves it by the type of the object:
		//run time polymorphism
        
	}

}
