package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//this is as per page object model, one separate class for every page 
	//created LoginPage class for under pages package
	//here, we write code for login page to find locators of 
	//elements used for login anf threir actions 
	
	private WebDriver driver;
	//this are class variables only 
	
	//adding locators of elements
	private By UserNameTextBox = By.id("Email");
	private By PasswordTextBox = By.id("Password");
	private By LoginButton = By.xpath("//button[@type='submit']");
	
	//create constructor with same name as class name
	//i.e. by default object of the class
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	//adding action functions of the above elements 
	public void enterUserName(String username) {
		
		//if required clear the fields first
		driver.findElement(UserNameTextBox).clear(); 
		driver.findElement(UserNameTextBox).sendKeys("username");
		//add username to another class instead of hardcode
		// username will be pass into test class
	}
	
	public void enterPassword(String password) {
		driver.findElement(PasswordTextBox).clear();
		driver.findElement(PasswordTextBox).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(LoginButton).click();
	}
}
