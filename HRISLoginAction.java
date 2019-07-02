import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRISLoginAction 
{
WebDriver driver;

By username=By.id("txtUserName");
By pass=By.id("txtPassword");
By loginbtn=By.name("Submit");


public HRISLoginAction(WebDriver driver)
{
	this.driver=driver;
}


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
}