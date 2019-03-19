package Packs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webs {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void practice()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ShanthiKandasamy\\Documents\\geckodriver.exe");
		
    }
	@Test
	 public void pracs()
	 {
		driver.get("http://www.qaclickacademy.com/");
		//Testing if it gets updated in Git
	 }
	

}
