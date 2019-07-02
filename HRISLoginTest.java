import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class HRISLoginTest 
{

//public void LaunchURL()
//{
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
//	WebDriver driver = new ChromeDriver();
//	driver.navigate().to("https://hris.qainfotech.com/login.php");
//	driver.manage().window().maximize();
//}
	
public void verifyValidLogin()
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://hris.qainfotech.com/login.php");
	driver.manage().window().maximize();
	HRISLoginAction login=new HRISLoginAction(driver);
	login.inputUserName("vaishali.yadav");
	login.inputPassword("Anshul@13");
	login.clickOnLoginButton();
	
	String url="https://hris.qainfotech.com:8086/time/timesheet";
	System.out.println(url);
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
	Assert.assertEquals(url, actualurl);
}


}