package webFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {

	public static void main(String[] args) {
		// to matching version
		WebDriverManager.chromedriver().setup();

		// browser launching
		WebDriver driver = new ChromeDriver();

		// url launching
		driver.get("https://www.vuse.com/za/en/customer/account/login");

		// screen maximizing
		driver.manage().window().maximize();

		// cookie handling
		WebElement cookiehandle = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		cookiehandle.click();

		// over18 tab
		WebElement over18 = driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']"));
		over18.click();

		// hendling Iamnewhere tab
		WebElement newhere = driver.findElement(By.xpath("(//span[@class='main-title'])[2]"));
		newhere.click();

		// create new acc tab
		WebElement newacc = driver.findElement(By.xpath("//a[@class='action create primary']"));
		newacc.click();

		// Select type dropdown handling
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s = new Select(dropdown);

		// methods to selecting value of dropdown
		s.selectByVisibleText("Female");
		// s.selectByIndex(1);
		// s.selectByValue("2");
	}

}
