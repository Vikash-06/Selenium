package demo;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {

	@Parameters({ "siteurl" })
	@Test(groups = "smoke")
	public void carLoan(String url) {
		System.out.println(url + Thread.currentThread().getId());
	}

	@Test(groups = "smoke")
	public void homeLoan() {
		System.out.println("homeloan" + Thread.currentThread().getId());
		Assert.assertTrue(false);
	}

	@Parameters({ "username", "password" })
	@Test(groups = "smoke")
	public void autoLoan(String uname, String pass) {
		System.out.println(uname + pass);
	}

}
