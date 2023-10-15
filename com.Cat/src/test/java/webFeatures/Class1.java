package webFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args) {
		// compatible local browser(chrome browser) version to Webdriver version (i.e
		// chrome driver)
		WebDriverManager.chromedriver().setup();

		// launch the browser
		// note: WebDriver is an interface and ChromeDriver is a class
		WebDriver driver = new ChromeDriver();

		// launch the URL
		driver.get("https://www.saucedemo.com/");

		// to maximize the screen
		driver.manage().window().maximize();

		// Username tab
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys("Test");

		// Password tab
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("vikash@1994");

		// login button
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		

	}

}
