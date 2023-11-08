package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaRegpage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement Createaccnt;
	
	@FindBy(id="firstname")
	WebElement Fname;
	
	@FindBy(id="lastname")
	WebElement Lname;
	
	@FindBy(id="email_address")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement pswd;
	
	@FindBy(id="password-confirmation")
	WebElement pswdcnfrmtn;
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement Createanaccnt;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement logout;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	WebElement signout;
	
	public LumaRegpage(WebDriver driver)
	{
    this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void setValues() throws InterruptedException
	{
		Createaccnt.click();
		Fname.sendKeys("abc");
		Lname.sendKeys("nb");
		Email.sendKeys("unni12@gmail.com");
		pswd.sendKeys("Qwertyu@123");
		pswdcnfrmtn.sendKeys("Qwertyu@123");
		Createanaccnt.click();
		Thread.sleep(3000);
		logout.click();
		signout.click();
	  
	}

}
