package staticblocks;

public class Staticblockq1 {
	// Ques.1 Explain Static block in java
	//note: static block's will be executed first befor executing the main method.

	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}

	public static void main(String[] args) {
		System.out.println("testing");

	}
	static {
		System.out.println("static block3");
	}

}
