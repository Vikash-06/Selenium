package webFeatures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3 {
	// how to select value in bootstrapdropdown

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement bootstrapdropdown = driver.findElement(By.xpath("//button[@id='menu1']"));
		bootstrapdropdown.click();
		List<WebElement> bucket = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));

		for (WebElement ele : bucket) {
			String name = ele.getText();
			if (name.equals("CSS")) {
				ele.click();
				break;
			}
		}

	}

}
