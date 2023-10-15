package page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	public void user_enters_valid_username_and_password(String username, String password) {
		WebElement loginlogo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		String actualHeading = loginlogo.getText();
		assertEquals("Swag Labs", actualHeading);

		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys(username);
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys(password);
	}

	public void user_click_on_login_button() {
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();

	}

	public boolean validate_successful_login() {
		WebElement ProductHeading = driver.findElement(By.xpath("//span[@class='title']"));
		return ProductHeading.isDisplayed();

	}

}
