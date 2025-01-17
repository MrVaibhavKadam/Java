package generic;
//create a Holder class:generic class :parameterized type info is included in class declaration
public class Holder <T> {
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	

}
