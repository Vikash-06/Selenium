package webFeatures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class4 {

	public static void main(String[] args) {

		// how to handle alert pop up
		// Alert is a interface and contains multiple methods to handle alert pop up
		// Methods: void.accept(); void dismiss(); void.sendkeys(""); getText();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebElement tab1 = driver.findElement(By.xpath("//button[@id='promptBox']"));
		tab1.click();
		
		Alert a = driver.switchTo().alert();
		
		String texting = a.getText();
		System.out.println(texting);
		a.sendKeys("hello my name is vikash");
		a.accept();

	}

}
