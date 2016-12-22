package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverFactory {

	private static WebDriver driver = null;
	private static final String URL = "https://www.verizon.com/";

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		WebDriverFactory.driver = driver;
	}

	public void initializewebdriver() {

		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver",
		// "C://Selenium//geckodriver.exe");
		// driver = new FirefoxDriver();
		// System.setProperty("webdriver.ie.driver",
		// "C://Selenium//IEDriverServer.exe");
		// driver = new InternetExplorerDriver();

		// System.setProperty("webdriver.edge.driver",
		// "C://Selenium//MicrosoftWebDriver.exe");
		// driver = new EdgeDriver();

		driver.get(URL);
		driver.manage().window().maximize();
	}

	public void teardown() {

		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.close();
		}

	}

}
