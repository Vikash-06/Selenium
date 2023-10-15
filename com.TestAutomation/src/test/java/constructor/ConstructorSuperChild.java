package constructor;

public class ConstructorSuperChild extends ConstructorSuperKeyparent {

	public ConstructorSuperChild(int i) {
		super(i);
		System.out.println("this is my child class");
	}

	public ConstructorSuperChild(int n, int m) {
		super(n, m);

	}

	public ConstructorSuperChild() {
		super();

	}

	public static void main(String[] args) {
		ConstructorSuperChild obj = new ConstructorSuperChild(100);
		ConstructorSuperChild obj1 = new ConstructorSuperChild(20, 40);
		ConstructorSuperChild obj2 = new ConstructorSuperChild();

	}

}
