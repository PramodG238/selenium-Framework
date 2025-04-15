package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CheckoutPageFlow;
import pages.LoginPage;

public class CheckoutTest extends BaseTest {
	
	@Test
	public void testCheckoutFlow() {
		CheckoutPageFlow checkoutPageFlow = new CheckoutPageFlow(driver);
		String expectedMessage = "Delivery";
		String actualMessage = driver.findElement(By.xpath("//h2[normalize-space()='Delivery']")).getText();
		System.out.println("You are on page: " + driver.getTitle());
		Assert.assertEquals(expectedMessage, actualMessage);
		System.out.println("Equal Assertion verfied");
		
	}
	    
}
