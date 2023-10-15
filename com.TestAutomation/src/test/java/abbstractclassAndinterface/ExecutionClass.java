package abbstractclassAndinterface;

public class ExecutionClass {

	public static void main(String[] args) {
		BMW ob = new BMW();
		ob.test1();//overriden method
		ob.test2();
		ob.test3();
		ob.BMWtest();
		System.out.println("******");
		//dynamic polymorphism
		AbstractClassConcept abs = new BMW();
		abs.test1();//overriden method
		abs.test2();
		abs.test3();
		
		

	}

}
