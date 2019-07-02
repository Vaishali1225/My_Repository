import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRISTest 
{
	@Test
	public void Login()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://hris.qainfotech.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name='txtUserName']")).sendKeys("vaishali.yadav");
		driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys("Anshul@13");
		driver.findElement(By.cssSelector("[name='Submit']")).click();
		driver.quit();
		

	
	}
}
