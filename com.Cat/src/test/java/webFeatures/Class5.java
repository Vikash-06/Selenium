package webFeatures;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class5 {
	// Window handling
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		// find the parent window Id
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		btn1.click();

		// to shift focus on child window
		Set<String> storage1 = driver.getWindowHandles();
		for (String bucket1 : storage1) {
			if (!parentID.equals(bucket1)) {
				driver.switchTo().window(bucket1);
				break;
			}
		}

		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Vikash");

		// close the current window
		driver.close();

		// to close the browser we use below method
		// driver.quit();

		// to shift focus back to the parent window
		driver.switchTo().window(parentID);

		WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
		textbox.sendKeys("hello how are you!!!");

	}

}
