package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
//loginTest is inheriting from BaseTest
//child extends parents class
//directly use all finctions from BaseTest
public class LoginTest extends BaseTest{
	//only pure test script write here
	//Not do any locators, setup/ teardown
	
	@Test
	public void testValidLogin() {
		//to create object of loginPage class
		LoginPage loginPage = new LoginPage(driver);
		//object loginPage
		loginPage.enterUserName("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
	
	//check title 
	//driver.getTitle();
		System.out.println("Title of the page is: "+ driver.getTitle());
		 
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");
	}
	
//
//\\public void testInvalidLogin() {
//	LoginPage loginPage = new LoginPage(driver);
	//loginPage.enterUserName("wrong@yourstore.com");
		//loginPage.enterPassword("wrongpass");
	//loginPage.clickLogin();
	//Assert.assertTrue(loginPage.isLoginErrorDisplayed());
		
//}
}
