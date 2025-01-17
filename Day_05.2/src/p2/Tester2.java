package p2;


public class Tester2 {

	public static void main(String[] args) {
		Computable ref;
		ref=new MyComputable();//up casting
		System.out.println(ref.compute(10,20)); 
		System.out.println(((MyComputable)ref).isEven(23));
		ref=new OtherImplementClass();
		System.out.println(ref.compute(10,20));
		//System.out.println(((MyComputable)ref).isEven(23));Run time err:classCastException:OtherImplementClass can't
		// -be cast into MyComputable.
		if(ref instanceof MyComputable)
			System.out.println(((MyComputable)ref).isEven(23));
		else
			System.out.println("invalide coomputable..!");

	}

}
