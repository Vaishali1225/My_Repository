import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class HRISTestNG {
	
	  HRISLoginAction login;
	 @BeforeClass
	  public void beforeClass()
	 {
			login=new HRISLoginAction();
			login.initialiseWebDriver();
			login.LaunchUrl();
			
	  }
  @Test
  public void f() {
		login.inputUserName("vaishali.yadav");
		login.inputPassword("Anshul@13");
		login.clickOnLoginButton();
		login.UserLoggedIn();
  }
 

	
 

}
