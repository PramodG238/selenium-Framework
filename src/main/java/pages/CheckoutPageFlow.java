package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutPageFlow {
	private WebDriver driver;
	
	private By product = By.id("\"//a[@id='StandardCardNoMediaLink-template--19186805637363__custom_featured_collection_pXMHER-9024688029939']//div//div[@id='Slider-template--19186805637363__custom_featured_collection_pXMHER ']\"");
	private By productsize = By.xpath("//label[@for='template--19186806128883__main-2-2']");
	private By fitSize = By.xpath("//label[@for='template--19186806128883__main-3-1']");
	private By addCart = By.id("ProductSubmitButton-template--19186806128883__main");
	private By checkOutButton = By.id("checkout");
	
	//private By actualMessage =By.xpath("//h2[normalize-space()='Delivery']");
	//private String expectedMessage = "Delivery";
	//adding locators of elements
	
	// Constructor to initialize WebDriver
	public CheckoutPageFlow(WebDriver driver){
		this.driver = driver;
	}
	  
	// Method to scroll down
		public void scrollDown() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	    }
		
    //adding action functions of the above elements 
    public void actions() {
    	//click on product
    	driver.findElement(product).click();
    	//click on size of product
    	driver.findElement(productsize).click();
    	//click on FitSize
    	driver.findElement(fitSize).click();
    	//Click on Add to cart
    	driver.findElement(addCart).click();
    	//Click on CheckoutButton
    	driver.findElement(checkOutButton).click(); 
    }
		
}
