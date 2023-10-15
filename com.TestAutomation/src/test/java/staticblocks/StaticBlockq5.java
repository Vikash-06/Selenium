package staticblocks;

public class StaticBlockq5 {
	//q: Is it possibLe to run java program without using main method
	
	int age= 10;
	static String name = "vikash";
	
	
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}

	public static void main(String[] args) {
		

	}

}
