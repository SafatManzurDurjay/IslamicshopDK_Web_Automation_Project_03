package Webpages;

import org.openqa.selenium.By;

public class IslamicshopDK_Cart_Page extends Base_Page {
	
	 private By choosebook = By.xpath("(//img[@alt='আর্গুমেন্টস অব আরজু'])[1]");
	 private By addtocart = By.xpath("(//button[normalize-space()='Add to cart'])[1]");
	 private By clickicon = By.xpath("(//i)[4]");
	 
	  public void clickonbook() {
		 clickOnElement(choosebook); 
		  
	  }
	  
	  public void addincart() {
		  
		  clickOnElement(addtocart);
	  }
	  
	  public void carticon() {
		  
		  clickOnElement(clickicon);
	  }

}
