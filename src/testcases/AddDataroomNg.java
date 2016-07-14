package testcases;

import org.testng.annotations.Test;

import utility.AddDatarm;

//import org.testng.annotations.BeforeMethod;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddDataroomNg {
	public static  WebDriver driver;
  @Test(enabled=false)
  public void testdatarm() throws Exception {
  driver = new ChromeDriver();
  RefLogin.dologin(driver);
  AddDatarm.addBtn(driver).click();
  AddDatarm.dataroomName(driver).sendKeys("Social media takeovers are");
  AddDatarm.saveBtn(driver).click();
  Thread.sleep(2000);
  
  }
  
  @Test(enabled=false)
  public void testdatarmcancel() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("Social media takeovers are");
	  AddDatarm.cancelBtn(driver).click();
	  Thread.sleep(2000);
	  
  }
  @Test(enabled=false)
  public void testdatarmblank() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys();
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(2000);
	  
  }
  @Test(enabled=false)
  public void testdiscription() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(2000);
  }  @Test(enabled=false)
  public void testAddpeople() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("Social media takeovers are");
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.addPeople(driver).sendKeys("anuj@ravabe.com");
	  Thread.sleep(3000);
	  AddDatarm.addPeopleBtn(driver).click();
	  Thread.sleep(2000);
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
  @Test(enabled=false)
  public void testcheckinternal() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("Social media takeovers are");
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.internalUser(driver).click();
	  Thread.sleep(2000);
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
  @Test(enabled=false)
  public void testviewonly() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("yes");
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.viewOnly(driver).click();
	  Thread.sleep(2000);
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
  @Test(enabled=false)
  public void testcheckIntnalview() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("yes");
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.internalUser(driver).click();
	  Thread.sleep(2000);
	  AddDatarm.viewOnly(driver).click();
	  Thread.sleep(2000);
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
  @Test(enabled=false)
  public void testrestrictDomain() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("yes");
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.restrictDomain(driver).sendKeys("@ravabe.com");
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
  @Test
  public void testrestrictpeople() throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("yes");
	  AddDatarm.dataroomDiscription(driver).sendKeys("no");
	  AddDatarm.restrictDomain(driver).sendKeys("@ravabe.com");
	  AddDatarm.addPeople(driver).sendKeys("anuj@gmail.com");
	  Thread.sleep(3000);
	  AddDatarm.addPeopleBtn(driver).click();
	  Thread.sleep(3000);
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
