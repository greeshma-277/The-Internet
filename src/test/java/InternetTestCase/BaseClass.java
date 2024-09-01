package InternetTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseURL="https://the-internet.herokuapp.com/" ;
	public String username="tomsmith";
	public String password="SuperSecretPassword!";
	public static WebDriver driver;
	
	@BeforeClass
	public void setp()
	{
	
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();



	}
}
	

