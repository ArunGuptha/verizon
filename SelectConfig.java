package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class SelectConfig extends WebdriverWaitFunctions{
	
	
	
	public void Iphone(){
		webDriverFluentWait(By.xpath(".//*[@title='Silver']")).click();
		
		
		//webDriverFluentWait(By.xpath(".//*[@data-id='device-capacity-select']")).click();

		//webDriverFluentWait(By.xpath(".//*[@class='selected' and @rel='1']")).click();
		
		Select dropdown = new Select(getDriver().findElement(By.xpath(".//*[@id='device-capacity-select']")));
		dropdown.selectByVisibleText("128GB");
		
	
        webDriverFluentWait(By.xpath(".//*[@class='font-icon_recycle c-show-tradeIn-modal']")).click();
        webDriverFluentWait(By.xpath(".//*[@class='button primary' and @href='/device-recycle/?custType=1']")).click();
	}
	

}
