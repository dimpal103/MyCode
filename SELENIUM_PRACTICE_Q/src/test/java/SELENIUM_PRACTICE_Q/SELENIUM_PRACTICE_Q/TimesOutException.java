package SELENIUM_PRACTICE_Q.SELENIUM_PRACTICE_Q;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class TimesOutException extends TestCase {
	
	
	public void testTimesOutException() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usert\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		
		//try {
			
			driver.get("google.com");
			// ("https://www.google.com/")
			
	//	}catch (Exception e) {
			//System.out.println("Exception found");
			
			
		//}
		
		
		driver.quit();
		

		
	}

}
