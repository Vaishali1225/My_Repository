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
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	WebDriverWait wait=new WebDriverWait(driver, 20);
	driver.navigate().to("https://hris.qainfotech.com/login.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	String actualTitle = driver.getTitle();
	String expectedTitle = "HRIS Login";
	//assert
	assertTrue(actualTitle.equals(expectedTitle),"Title doesn't match");
	driver.findElement(By.id("txtUserName")).sendKeys("vaishali.yadav");
	driver.findElement(By.id("txtPassword")).sendKeys("Anshul@13");
	WebElement element = driver.findElement(By.name("Submit"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);
	WebElement element1=wait.until(ExpectedConditions.elementToBeClickable(By.id("engTimeSearch")));
	System.out.println("Url matched");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(1).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(2).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("[id='hamburger']")).click();
	Thread.sleep(1000);
	driver.findElements(By.id("addstatustag")).get(3).click();
	Thread.sleep(1000);
	


	
	

	}
	}