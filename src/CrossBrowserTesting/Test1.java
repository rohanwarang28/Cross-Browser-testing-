package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void validateTitleFF(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			driver.getTitle().contains("Google");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.quit();
		}
	
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.google.com");
			driver.getTitle().contains("Google");
			driver.quit();
			
		}
		
		/*driver.get("http://www.google.com");
		driver.getTitle().contains("Google");
		driver.quit();
		*/
		
	}
	
}
