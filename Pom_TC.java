package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pom_TC {

    private static WebDriver driver=null;
    
    public static void main(String args[]) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vaishali.yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	    
        driver=new ChromeDriver();
        
        driver.get("https://www.google.com");
        
        driver.findElement(By.cssSelector("[id='gb_70']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[id='identifierId']")).sendKeys("testn403@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext > span > span")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Test@1234");
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#passwordNext > span > span")).click();

        //driver.close();
}
}