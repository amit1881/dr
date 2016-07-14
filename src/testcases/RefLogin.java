package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import utility.TestHelper;

public class RefLogin {

	public static  WebDriver driver;
	public static void main(String args[]){
	RefLogin.dologin(driver);
	}
	 public static void dologin (WebDriver driver){
		 // driver = new ChromeDriver();
		  driver.navigate().to("http://test.ravabe.com/dataroom/");
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     // driver.navigate().to("http://test.ravabe.com/dataroom/");
	      driver.manage().window().maximize();
		  TestHelper.EmailAddress(driver).sendKeys("amit@ravabe.com");
	      TestHelper.LoginPassword(driver).sendKeys("Amit1234");
	      TestHelper.Login(driver).click();
	      //driver.close();

}
}
