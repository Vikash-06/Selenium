package webFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class7 {

	public static void main(String[] args) {
		// Actions Class in selenium
		// Use of JavascriptExecutor
		// Implicit wait
		//pageLoad Timeout
		//Explicit wait

		// note: JavJavascriptExecutor is a selenium predefined class which is use to
		// perform many actions like clicking and scrolling.

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// pageload timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement products = driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
		
		//implement Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(products));
		
		
		action.moveToElement(products).build().perform();
		WebElement live = driver.findElement(By.xpath("//a[@title='Live']"));
		action.click(live).build().perform();
		WebElement searchInput = driver.findElement(By.xpath("//input[@id='live-form-url']"));

		// JavascriptExecutor scroll into view method
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchInput);
		searchInput.sendKeys("hello nigga");
		action.sendKeys(Keys.ENTER).build().perform();

	}

}
