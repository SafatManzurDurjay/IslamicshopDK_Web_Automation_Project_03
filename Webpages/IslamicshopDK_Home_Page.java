package Webpages;

import org.openqa.selenium.By;

public class IslamicshopDK_Home_Page extends Base_Page{
	
	  private By clickoption = By.xpath("(//a[@href='https://www.islamicshopdk.com/product/book/ibadat/'][contains(text(),'আত্মশুদ্ধি ও অনুপ্রেরণা')])[1]");
	  
	  private By loadmore = By.xpath("(//span[normalize-space()='Load More'])[1]");
	 
	  
	  
	  public void clickonoption() {
		  
		 clickOnElement(clickoption);
	  }
	  
	  public void loadbooks() {
		  
		  clickOnElement(loadmore);
	  }
	  

	 	  

}