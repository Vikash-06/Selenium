package webFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class8 {
	// Navigation Method: for forward, backword and refreshing the page

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
