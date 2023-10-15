package constructor;

public class ConstructorSuperKeyparent {
	
	public ConstructorSuperKeyparent () {
		System.out.println("this is my parent class");
	}
	public ConstructorSuperKeyparent(int i) {
		System.out.println("values of single param "+i);
	}

	public ConstructorSuperKeyparent(int j, int k) {
		System.out.println("values of single param "+j);
		System.out.println("values of second param"+k);
	}

}
