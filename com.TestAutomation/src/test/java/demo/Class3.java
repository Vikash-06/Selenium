package demo;

import org.testng.annotations.Test;

public class Class3 {
	@Test (groups="smoke")
	public void loginUser() {
		System.out.println("loginUser"+Thread.currentThread().getId());
	}

	@Test (groups="smoke")
	public void logoutUser() {
		System.out.println("logoutUser"+Thread.currentThread().getId());
	}

	@Test (groups="smoke")
	public void mobileLogin() {
		System.out.println("MobileLogin"+Thread.currentThread().getId());
	}

	@Test (groups="smoke")
	public void mobileLogout() {
		System.out.println("MobileLogout"+Thread.currentThread().getId());
	}
}
