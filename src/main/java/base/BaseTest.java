package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//BaseTest baseTest = new BaseTest();
		//File src = new File("C:\\Users\\ravij\\eclipse-workspace\\selenium-Framework1\\Repository\\Object_Repo.properties");
		//FileInputStream Fis = new FileInputStream(src);
		//Properties pro = new Properties();
		//pro.load(Fis);
		//baseTest.OpenURL(driver, pro.getProperty("URL2"));
		//Thread.sleep(3000);
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//change here URL only 
		//driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		//driver.findElement(By.xpath("//button[@aria-label='Hide survey']")).click();
		
	}
	
	private void OpenURL(WebDriver driver2, String property) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void tearDown() {//throws InterrumptedException {
		//Thread.sleep(300);
		if (driver != null) {
			driver.quit();
		}
	}
}
