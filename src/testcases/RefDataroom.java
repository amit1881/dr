package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import utility.AddDatarm;

public class RefDataroom {

	public static  WebDriver driver;
	public static void main(String args[]) throws InterruptedException{
	RefDataroom.Dataroom(driver);
	}
	 public static void Dataroom (WebDriver driver) throws InterruptedException{
		  //driver = new ChromeDriver();
		  driver.navigate().to("http://test.ravabe.com/dataroom/");
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     // driver.navigate().to("http://test.ravabe.com/dataroom/");
	      driver.manage().window().maximize();
	      RefLogin.dologin(driver);
	      AddDatarm.addBtn(driver).click();
	      AddDatarm.dataroomName(driver).sendKeys("professional with a custom ");
	      AddDatarm.dataroomDiscription(driver).sendKeys("no");
	      AddDatarm.addPeople(driver).sendKeys("anuj@ravabe.com");
		  Thread.sleep(3000);
		  AddDatarm.addPeopleBtn(driver).click();
		  Thread.sleep(3000);
	      AddDatarm.saveBtn(driver).click();

} 
}
