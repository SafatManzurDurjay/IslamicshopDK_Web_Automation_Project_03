package Webpages;

import org.openqa.selenium.By;

public class IslamicshopDK_Checkout_Page extends Base_Page {
	
	private By clickcheckout = By.xpath("(//a[contains(text(),'Checkout')])[1]");
	
	public void checkout() {
		
		clickOnElement(clickcheckout);
	}

}
