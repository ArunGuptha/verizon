package webpages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.collections.Lists;

public class RateTradeinDevice extends WebdriverWaitFunctions {

	
	public void review(){
	
		webDriverFluentWait(By.xpath(".//label[@for='trade-in-qa-1-yes']")).click();
		webDriverFluentWait(By.xpath("//h1[text()='Appraise Your Device']//following::ins[3]")).click();
		webDriverFluentWait(By.xpath("//h1[text()='Appraise Your Device']//following::ins[5]")).click();
		webDriverFluentWait(By.xpath("//h1[text()='Appraise Your Device']//following::ins[7]")).click();

		webDriverFluentWait(By.xpath(".//*[@id='selectTradInDeviceId']/div[2]/div[1]/div/a/span")).click();

//		String value = webDriverFluentWait(By.xpath(".//*[@class='appraised-amount pull-left']")).getText();
//		String x = "$22000";
//		if (value == x) {
//			System.out.println("verified");
//		} else {
//			System.out.println("not verified");
//			
//		}
		webDriverFluentWait(By.xpath(".//*[@class='btn btn-red appraiseContinue']")).click();
		webDriverFluentWait(By.xpath("html/body/div[5]/form/div/div[5]/div/a")).click();
		webDriverFluentWait(By.xpath("html/body/div[5]/section/div/div[2]/form/div/label/span")).click();
		webDriverFluentWait(By.xpath(".//*[@id='acceptTermsBtn']")).click();
		
	}
}
