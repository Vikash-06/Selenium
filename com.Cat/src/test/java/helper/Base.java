package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	static {
		try {
			FileInputStream file = new FileInputStream("TestingData/TestData.properties");
			prop = new Properties();
			prop.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Before
	public void setup() {
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
		} else if (BrowserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--incognito");
			driver = new EdgeDriver(option);
		}

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	public void waitforExpectedElement(WebElement ele, int Timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void waitforAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public void waitforElementClickable(WebElement ele, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public void MouseHovering(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	}

	public void selectAlertPopUp(int timeout) {
		waitforAlert(timeout);
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void SelectDropDownByVisibleText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);

	}

	public void SelectDropDownbyValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}

	public void SelectDropDownByIndex(WebElement ele, int value) {
		Select select = new Select(ele);
		select.selectByIndex(value);
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File main = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(main, new File("Screenshot/" + scenario.getName() + ".png "));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}
