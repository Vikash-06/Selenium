package staticblocks;

public class Staticblockq3 {
	// How can we create objects if we make the constructor as private
	int age;
	static {
		Staticblockq3 obj1= new Staticblockq3();
	}
public static int createobject() {
	Staticblockq3 obj1= new Staticblockq3();
	obj1.age=50;
	return obj1.age;
	
}
	private Staticblockq3() {
		age = 40;
	}

	public static void main(String[] args) {
		Staticblockq3 obj = new Staticblockq3();
		System.out.println(obj.age);

	}

}
