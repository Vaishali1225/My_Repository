package pageObjects;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class HrisLogin {
	public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	    	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://hris.qainfotech.com/login.php");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='icon-lock']/following-sibling::span")).click();

	driver.findElement(By.id("txtUserName")).sendKeys("vaishali.yadav");
	driver.findElement(By.id("txtPassword")).sendKeys("Anshul@13");
	driver.findElement(By.name("Submit")).click();;
	
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size taskboard']/following-sibling::span")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size dashboard']/following-sibling::span")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size leave']/following-sibling::span")).click();
	Thread.sleep(1000);
	//driver.findElement(By.cssSelector("[id='hamburger']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size ear']/following-sibling::span")).click();
	Thread.sleep(1000);driver.navigate().to("https://hris.qainfotech.com/login.php");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='icon-lock']/following-sibling::span")).click();

	driver.findElement(By.id("txtUserName")).sendKeys("vaishali.yadav");
	driver.findElement(By.id("txtPassword")).sendKeys("Anshul@13");
	driver.findElement(By.name("Submit")).click();;
	
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size support']/following-sibling::span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size onsite']/following-sibling::span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size HR']/following-sibling::span")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size feedback']/following-sibling::span/parent::a")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@class='icon_size assessment']/following-sibling::span/parent::a")).click();
	
	
	


	
	

	}
	}