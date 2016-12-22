package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage extends WebdriverWaitFunctions {

	
	public void wirelessSelection(){

		webDriverFluentWait(By.xpath(".//*[@id='display_popup_portal_book_1']/div/div/div[1]/div[1]/div/div[1]/ul/li[1]/a")).click();
		
		WebElement wireless=webDriverFluentWait(By.xpath(".//*[@id='onavmenu1' and @href='https://www.verizonwireless.com/landingpages/shop-phones-devices/']"));
		
		Actions action= new Actions(getDriver());
		action.moveToElement(wireless).build().perform();
		
		WebElement phones=getDriver().findElement(By.xpath(".//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/a/span"));
		Actions action2= new Actions(getDriver());
		action2.moveToElement(phones).build().perform();
	
		webDriverFluentWait(By.xpath(".//*[@id='desktopOmniNav']/div[3]/ul/li[1]/div[2]/div/ul/li[1]/div[2]/div/table/tbody/tr[3]/td[2]/span[1]/img")).click();;
	
	
}
}