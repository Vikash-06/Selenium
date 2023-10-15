package programs;

public class StaticBlockorFinalKeyword {
	// Program no. 22
	//Will static block will be executed with final keyword
	//answer is NO. it will execute of print only 100 
	//but yes if we remove final keyword then it will print static block and then will print 100.

	public static void main(String[] args) {
		System.out.println(Main.x);
	}
}

class Main {
	public static final int x = 100;

	static {
		System.out.println("Main class...static block");
	}
}
