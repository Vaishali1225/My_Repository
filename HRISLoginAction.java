import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HRISLoginAction 
{
WebDriver driver;

void initialiseWebDriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	driver = new ChromeDriver();
}

void LaunchUrl()
{
	driver.navigate().to("https://hris.qainfotech.com/login.php");
	driver.manage().window().maximize();
}
By username=By.id("txtUserName");
By pass=By.id("txtPassword");
By loginbtn=By.name("Submit");



public void inputUserName(String uid)
{
driver.findElement(username).sendKeys(uid);
}
public void inputPassword(String pass2)
{
	driver.findElement(pass).sendKeys(pass2);
}

public void clickOnLoginButton()
{
driver.findElement(loginbtn).click();
}

public void UserLoggedIn()
{
	String url="https://hris.qainfotech.com:8086/time/timesheet";
	System.out.println(url);
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
	Assert.assertEquals(url, actualurl);
}
}