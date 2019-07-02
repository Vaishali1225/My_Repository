import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRISTestXPath {
	
		@Test
		public void Login()
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://hris.qainfotech.com/login.php");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("vaishali.yadav");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Anshul@13");
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
			driver.quit();
			

		
		}
	}

