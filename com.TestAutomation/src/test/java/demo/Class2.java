package demo;

import org.testng.annotations.Test;

public class Class2 {

	@Test (groups="smoke")
	public void MobilecarLoan() {
		System.out.println("MobTest"+Thread.currentThread().getId());
	}

	@Test (groups="smoke")
	public void MobilehomeLoan() {
		System.out.println("Mobhomeloan"+Thread.currentThread().getId());
	}

	@Test (groups="smoke")
	public void MobileautoLoan() {
		System.out.println("MobAutoLoan"+Thread.currentThread().getId());
	}

}
