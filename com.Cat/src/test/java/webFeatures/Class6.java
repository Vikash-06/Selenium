package webFeatures;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);

		WebElement btn0 = driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
		btn0.click();

		Set<String> obj = driver.getWindowHandles();

		for (String s : obj) {
			if (!ParentID.equals(s)) {
				driver.switchTo().window(s);
				String mainwindow = driver.getTitle();
				if (mainwindow.contains("AlertsDemo")) {
					WebElement clickme = driver.findElement(By.xpath("//button[@id='alertBox']"));
					clickme.click();
					Alert a = driver.switchTo().alert();
					a.accept();
					break;
				}
			}
		}
		driver.switchTo().window(ParentID);
		WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
		textbox.sendKeys("baba ka dhaba");

	}

}
