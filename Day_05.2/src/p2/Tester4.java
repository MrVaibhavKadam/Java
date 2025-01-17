package p2;

public class Tester4 {
	public static void main(String[]args) {
		
		Computable[]computables= {new MyComputable(),new OtherImplementClass()};
		for (Computable c: computables) {
			System.out.println(c.compute(20, 10));
		//How to invoke isEven ?
		if(c instanceof MyComputable)
			System.out.println("Is Even- "+((MyComputable)c).isEven(125));
		else
			System.out.println("Invalide Computable...!");
		}
	}

}
