package webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeviceAppraisal extends WebdriverWaitFunctions {

	
	public void TradeInDevice(String imei){
		
		
	
		Select dropdown = new Select(webDriverFluentWait(By.xpath(".//select[@class='selectpicker processed' and @name='carrier']")));
		dropdown.selectByVisibleText("AT&T");
		
		Select dropdown1=new Select(webDriverFluentWait(By.xpath(".//select[@class='selectpicker processed' and @name='manufacturer']")));
		dropdown1.selectByVisibleText("Apple");

		webDriverFluentWait(By.xpath(".//a[@title='iPhone 6S']")).click();
		
		
		Select dropdown2 = new Select(webDriverFluentWait(By.xpath(".//select[@class='selectpicker processed' and @name='memory']")));
		dropdown2.selectByVisibleText("16GB");
		
//		webDriverFluentWait(By.xpath(".//span[@class='filter-option' and text()='Memory size']")).click();
//		webDriverFluentWait(By.xpath(".//span[text()='16GB ']")).click();
		
		
		Select dropdown3 = new Select(webDriverFluentWait(By.xpath(".//select[@class='selectpicker processed' and @name='color']")));
		dropdown3.selectByVisibleText("Silver");
		 
		webDriverFluentWait(By.xpath(".//input[@class='btn btn-red' and @value='Continue']")).click();
		
		webDriverFluentWait(By.xpath(".//input[@name='device-id']")).sendKeys(imei);
		
		webDriverFluentWait(By.xpath(".//input[@class='btn btn-red' and @value='Continue']")).click();
	
	}}
