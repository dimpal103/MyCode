package SELENIUM_PRACTICE_Q.SELENIUM_PRACTICE_Q;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.TestCase;

public class autoTextBox extends TestCase {
	
	
	public void testautoTextBox() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usert\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// automation of google auto text box
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		// enter bihar in search box 
		
		searchBox.sendKeys("bihar");
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		action.moveToElement(searchBox);
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("gsr"));
		//searchBox.sendKeys(Keys.ARROW_DOWN);
		
		//searchBox.sendKeys(Keys.ARROW_DOWN);
		
		searchBox.sendKeys(Keys.ENTER); 
		
		Thread.sleep(4000);
	}

}
