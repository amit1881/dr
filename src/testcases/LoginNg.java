package testcases;

import org.testng.annotations.Test;

import utility.TestHelper;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginNg {
	public static  WebDriver driver;
  @Test
  public void testLogin() throws Exception {
   TestHelper.EmailAddress(driver).sendKeys("amit@ravabe.com");
   TestHelper.LoginPassword(driver).sendKeys("Amit1234");
   TestHelper.Login(driver).click();
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.navigate().to("http://test.ravabe.com/dataroom/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
