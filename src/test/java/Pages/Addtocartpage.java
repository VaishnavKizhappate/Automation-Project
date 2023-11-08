package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	
	WebDriver driver;
	
	@FindBy(id="search")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li/div/a/span/span/img")
	WebElement prdct;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li/div/div/div[3]/div/div[1]/form/button")
	WebElement addcart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"minicart-content-wrapper\"]/div[2]/div[5]/div/a")
	WebElement viewcart;
	
    public Addtocartpage(WebDriver driver)
	{
    this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	public void selectproducts() throws InterruptedException
	{
	search.sendKeys("products",Keys.ENTER);
	Actions act=new Actions(driver);
	act.moveToElement(prdct).perform();
	Thread.sleep(2000);
	addcart.click();
	Thread.sleep(2000);
	cart.click();
	Thread.sleep(2000);
	viewcart.click();
	}

}
