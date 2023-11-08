package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowishlistpage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr[2]/td/div/a[1]")
	WebElement movetowishlist;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")
	WebElement buttn;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")
	WebElement mywishlist;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/nav/ul/li[1]/a")
	WebElement whatsnew;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/ul/li[1]/a")
	WebElement home;
	
	
	
    public Addtowishlistpage(WebDriver driver)
	{
    this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
    
    public void wishlist() throws InterruptedException
    {
    	movetowishlist.click();
    	Thread.sleep(2000);
    	buttn.click();
    	Thread.sleep(2000);
    	mywishlist.click();
    	Thread.sleep(2000);
    	whatsnew.click();
    	Thread.sleep(2000);
    	home.click();
    	
    }

}
