package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	WebDriver driver;
	
	@FindBy(id="search")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/dl/dd[1]/a")
	WebElement tshirt;
	
	@FindBy(xpath="/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div/a/span/span/img")
	WebElement img;
	
	@FindBy(xpath="/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol/li[2]/div/div/div[4]/div/div[1]/form/button")
	WebElement addcart;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[1]/div/div[2]")
	WebElement small;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/div/div[2]")
	WebElement clr;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div[2]/div/div/div[2]/button")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement cart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[3]/div/button")
	WebElement checkout;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")
	WebElement nxt;
	
	@FindBy(xpath="//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
	WebElement placeholder;
	
	public Checkoutpage(WebDriver driver)
	{
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	}
	
	public void checkout() throws InterruptedException
	{
		search.sendKeys("shirts for men",Keys.ENTER);
		Thread.sleep(2000);
		tshirt.click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(img).perform();
		Thread.sleep(2000);
		addcart.click();
		Thread.sleep(2000);
		small.click();
		Thread.sleep(2000);
		clr.click();
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(2000);
		cart.click();
		Thread.sleep(2000);
		checkout.click();
		Thread.sleep(3000);
		nxt.click();
		Thread.sleep(3000);
		placeholder.click();
		driver.close();
	}

}
