package staticblocks;

public class StaticBlockq6 {
	//Can we Initialize member variables within static block
	//yes we can
	
	int age;
	static String name;
	
	static {
		StaticBlockq6 ob = new StaticBlockq6();
		StaticBlockq6.name= "bob";
		System.out.println(StaticBlockq6.name);
		ob.age = 30;
		System.out.println(ob.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
