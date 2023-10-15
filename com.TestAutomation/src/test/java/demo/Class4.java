package demo;

import org.testng.annotations.Test;

public class Class4 {
	@Test (groups="smoke")
	public void depositMoney() {
		System.out.println("deposit"+Thread.currentThread().getId());
	}

}
