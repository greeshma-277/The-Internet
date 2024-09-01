package Internetpageobject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	public Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements((SearchContext) this, rdriver);
		
	}
	@FindBy(linkText="Form Authentication")
	@CacheLookup
	WebElement formAuthLink;
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName; 
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword; 
	
	@FindBy(name="//i[@class='fa fa-2x fa-sign-in']")
	@CacheLookup
	WebElement btnLogin;
	 
	
	@FindBy(xpath="//*[@id='content']/div/a/i")
	@CacheLookup
	WebElement btnLogout;
	
	public void clicklinkText()
	{
		formAuthLink.click();
	}
		
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
		
		
	}
	public void clicklogout()
	{
		btnLogout.click();
	}

}
