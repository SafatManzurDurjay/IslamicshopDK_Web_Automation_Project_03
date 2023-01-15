package webtests;

import static org.testng.Assert.assertEquals;
import static utilities.DriverSetup.getDriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Webpages.IslamicshopDK_Cart_Page;
import Webpages.IslamicshopDK_Checkout_Page;
import Webpages.IslamicshopDK_Home_Page;
//import io.qameta.allure.Description;
import utilities.DriverSetup;



public class LoginTest extends DriverSetup {
	
	IslamicshopDK_Home_Page islamicshopDK_Home_Page = new IslamicshopDK_Home_Page();
	IslamicshopDK_Cart_Page islamicshopDK_Cart_Page = new IslamicshopDK_Cart_Page();
	IslamicshopDK_Checkout_Page islamicshopDK_Checkout_Page = new IslamicshopDK_Checkout_Page();
		
	@Test
	public void loginTest() throws InterruptedException {

		getDriver().get("https://www.islamicshopdk.com/");

		JavascriptExecutor js = (JavascriptExecutor) getDriver();

		assertEquals(getDriver().getTitle(), "Home of Books | Islamic Shop Dhaka | Online book store inBangladesh");
		
		JavascriptExecutor js1 = (JavascriptExecutor)getDriver();
		
		
	
		
		js1.executeScript("window.scrollBy(0,1000)","");
		js1.executeScript("window.scrollBy(0,1000)","");
		js1.executeScript("window.scrollBy(0,1000)","");

		
		islamicshopDK_Home_Page.clickonoption();
		
		js.executeScript("window.scrollBy(0,1000)","");
		js.executeScript("window.scrollBy(0,1000)","");
		js.executeScript("window.scrollBy(0,600)","");
		
		islamicshopDK_Home_Page.loadbooks();
		
		
		islamicshopDK_Cart_Page.clickonbook();
		js.executeScript("window.scrollBy(0,200)","");
		
		islamicshopDK_Cart_Page.addincart();
		islamicshopDK_Cart_Page.carticon();
		
		islamicshopDK_Checkout_Page.checkout();
		
		WebElement element = getDriver().findElement(By.xpath("//input[@id='billing_first_name']"));
		element.sendKeys("S.M. Safat Manzur");
		
		element = getDriver().findElement(By.xpath("//input[@id='billing_last_name']"));
		element.sendKeys("Durjay");
		
		element = getDriver().findElement(By.xpath("//input[@id='billing_address_1']"));
		element.sendKeys("H#83, Goaltek Mosjid Road");
		
		element = getDriver().findElement(By.xpath("//input[@id='billing_city']"));
		element.sendKeys("Uttara");
		
//		element = getDriver().findElement(By.xpath("//span[@aria-label='District']"));
//		element.click();
		
//		element = getDriver().findElement(By.xpath("#select2-billing_state-container"));
//		element.click();
		
		element = getDriver().findElement(By.xpath("//input[@id='billing_postcode']"));
		element.sendKeys("1230");
		
		element = getDriver().findElement(By.xpath("//input[@id='billing_phone']"));
		element.sendKeys("01790891807");
		
		element = getDriver().findElement(By.xpath("//input[@id='billing_email']"));
		element.sendKeys("safatmanzur@gmail.com");
		
		js.executeScript("window.scrollBy(0,200)","");
		
		element = getDriver().findElement(By.xpath("//input[@name='bKash_acc_no']"));
		element.sendKeys("01790891807");
		
		element = getDriver().findElement(By.xpath("(//input[@placeholder='2M7A5'])[1]"));
		element.sendKeys("*****");
		Thread.sleep(3000);
		
		element = getDriver().findElement(By.xpath("//textarea[@id='order_comments']"));
		element.sendKeys("Take in place my order and call me whenever you arrive.");
		
		js.executeScript("window.scrollBy(0,200)","");

	}

}
