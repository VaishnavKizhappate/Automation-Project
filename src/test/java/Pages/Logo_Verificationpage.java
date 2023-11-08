package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logo_Verificationpage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/a/img")
	WebElement Logo;
	
	public Logo_Verificationpage(WebDriver driver)
	{
    this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	public void loginvalidation()
	{
	String exp="https://magento.softwaretestingboard.com/";
	String actual=driver.getCurrentUrl();
	Assert.assertEquals(actual,exp);
	System.out.println("\n Login validation passed");
	}
	
	public void logo_verification() throws IOException
	{
	boolean logo=Logo.isDisplayed();
	if(logo)
	{
	System.out.println("\n Logo is displayed");
	System.out.println();
	}
	else
	{
	System.out.println("\n Logo is not displayed");
	System.out.println();
	}
	//Screenshot of Logo »
	File lscr=Logo.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(lscr, new File("./Screenshot/logo.png"));
	}

}
