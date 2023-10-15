package exceptionhandling;

public class WithThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException {

		WithThrowsKeyword obj = new WithThrowsKeyword();

		obj.sum();
		System.out.println("bob");

	}

	public void sum() throws ArithmeticException {
		try{div();
		}catch(ArithmeticException m) {
			m.printStackTrace();
			System.out.println(m.getMessage());
	}
	}
	public void div() throws ArithmeticException {
		int i = 2 / 0;
		
	}

}
