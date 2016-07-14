package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utility.AddDatarm;

public class DeleteDataroom {
	public static  WebDriver driver;
  @Test
  public void deleteDataroom() {
	  driver = new ChromeDriver();
	  driver.navigate().to("http://test.ravabe.com/dataroom/");
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     // driver.navigate().to("http://test.ravabe.com/dataroom/");
      driver.manage().window().maximize();
      RefLogin.dologin(driver);
      AddDatarm.settingLink(driver).click();
      AddDatarm.deleteLink(driver).click();
  }
}
