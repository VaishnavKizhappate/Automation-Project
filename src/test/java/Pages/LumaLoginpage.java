package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaLoginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement signin;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pswd;
	
	@FindBy(id="send2")
	WebElement sign;
	

	public LumaLoginpage(WebDriver driver)
	{
    this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public void Login()
	{
		signin.click();
		email.sendKeys("monu@gmail.com");
		pswd.sendKeys("Qwertyu@123");
		sign.click();
	}

}
