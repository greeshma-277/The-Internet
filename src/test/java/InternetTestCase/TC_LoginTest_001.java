package InternetTestCase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Internetpageobject.Loginpage;
import dev.failsafe.internal.util.Assert;



public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		
      driver.get(baseURL);
      
      WebElement formAuthLink = driver.findElement(By.linkText("Form Authentication"));
      formAuthLink.click();
      Loginpage lp=new Loginpage(driver);
      lp.setUserName(username);
      lp.setPassword(password);
      lp.clickSubmit();
      
      WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
      String messageText = successMessage.getText();

      if (messageText.contains("You logged out of the secure area!")) {
          System.out.println("Logout successful.");
      } else {
          System.out.println("Logout failed. Unexpected message: " + messageText);
      }
      
  lp.clicklogout();
     
      
}}


