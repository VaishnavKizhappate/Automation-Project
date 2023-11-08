package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseUrl.LumaUrl;
import Pages.Addtocartpage;
import Pages.Addtowishlistpage;
import Pages.Checkoutpage;
import Pages.Logo_Verificationpage;
import Pages.LumaLoginpage;
import Pages.LumaRegpage;

public class LumaRegtest extends LumaUrl{
	
	@Test
	
	public void test() throws InterruptedException, IOException
	{
		//LumaRegpage ob=new LumaRegpage(driver);
		//ob.setValues();
		
		LumaLoginpage ob1=new LumaLoginpage(driver);
		ob1.Login();
		
		Logo_Verificationpage ob2=new Logo_Verificationpage(driver);
		ob2.loginvalidation();
		ob2.logo_verification();
		
		Addtocartpage ob3=new Addtocartpage(driver);
	    ob3.selectproducts();
	    
	    Addtowishlistpage ob4=new Addtowishlistpage(driver);
	    ob4.wishlist();
	    
	    Checkoutpage ob5=new Checkoutpage(driver);
	    ob5.checkout();
	    		
				
	}
	
	

}
