package webpagesTest;

import org.testng.annotations.Test;

import webpages.DeviceAppraisal;
import webpages.HomePage;
import webpages.RateTradeinDevice;
import webpages.SelectConfig;
import webpages.WebDriverFactory;

public class VerizonTest {

	@Test
	public void TestCases(){
		
		WebDriverFactory init= new WebDriverFactory();
		HomePage Slect= new HomePage();
		SelectConfig config=new SelectConfig();
		DeviceAppraisal tradeIn= new DeviceAppraisal();
		RateTradeinDevice rate=new RateTradeinDevice();
		
		init.initializewebdriver();
		Slect.wirelessSelection();
		config.Iphone();
		tradeIn.TradeInDevice("851515151516");
		rate.review();
		init.teardown();
	
		
	}
	
}
