package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.Addpro;

public class AddprojectNg {
	public static  WebDriver driver;
  @Test
   public void testproject() throws Exception {
      driver = new ChromeDriver();
      //RefLogin.dologin(driver);
      RefDataroom.Dataroom(driver);
      Thread.sleep(2000);
	  Addpro.Section(driver).click();
	  Thread.sleep(2000);
      //Addpro.addBtnPro(driver).click();
      //Thread.sleep(2000);
      Addpro.addProjectname(driver).sendKeys("yes");
      Addpro.saveproBtn(driver).click();
  }
  @Test
  public void testDiscription() throws Exception {
     driver = new ChromeDriver();
     //RefLogin.dologin(driver);
     RefDataroom.Dataroom(driver);
     Thread.sleep(2000);
	 Addpro.Section(driver).click();
	 Thread.sleep(2000);
    // Addpro.addBtnPro(driver).click();
    // Thread.sleep(2000);
     Addpro.addProjectname(driver).sendKeys("yes29");
     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
     Thread.sleep(2000);
     Addpro.saveproBtn(driver).click();
 }
  @Test
  public void testAddPeople() throws Exception {
     driver = new ChromeDriver();
     //RefLogin.dologin(driver);
     RefDataroom.Dataroom(driver);
     Thread.sleep(2000);
	 Addpro.Section(driver).click();
	 Thread.sleep(2000);
     //Addpro.addBtnPro(driver).click();
     //Thread.sleep(2000);
     Addpro.addProjectname(driver).sendKeys("yes30");
     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
     Thread.sleep(2000);
     Addpro.addProjectpeople(driver).sendKeys("anuj@ravabe.com");
     Thread.sleep(2000);
     Addpro.addPeopleBtn(driver).click();
     Thread.sleep(2000);
     Addpro.saveproBtn(driver).click();
 }
  @Test
  public void testInternalUser() throws Exception {
     driver = new ChromeDriver();
     RefLogin.dologin(driver); 
     Thread.sleep(2000);
	 Addpro.Section(driver).click();
	 Thread.sleep(2000);
     //Addpro.addBtnPro(driver).click();
    // Thread.sleep(2000);
     Addpro.addProjectname(driver).sendKeys("yes31");
     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
     Thread.sleep(2000);
     Addpro.internalUser(driver).click();
     Addpro.saveproBtn(driver).click();
  }
  @Test
  public void testViewOnly() throws Exception {
     driver = new ChromeDriver();
     RefLogin.dologin(driver); 
     Thread.sleep(2000);
	 Addpro.Section(driver).click();
	 Thread.sleep(2000);
    // Addpro.addBtnPro(driver).click();
    // Thread.sleep(2000);
     Addpro.addProjectname(driver).sendKeys("yes32");
     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
     Thread.sleep(2000);
     Addpro.viewOnly(driver).click();
     Addpro.saveproBtn(driver).click();
  }
  @Test
  public void testDomain() throws Exception {
     driver = new ChromeDriver();
     RefLogin.dologin(driver); 
     Thread.sleep(2000);
	 Addpro.Section(driver).click();
	 Thread.sleep(2000);
    // Addpro.addBtnPro(driver).click();
    // Thread.sleep(2000);
     Addpro.addProjectname(driver).sendKeys("yes33");
     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
     Thread.sleep(2000);
     Addpro.restrictDomain(driver).sendKeys("@ravabe.com");
     Addpro.saveproBtn(driver).click();
  }
  @Test
  public void testRestrictDomain() throws Exception {
     driver = new ChromeDriver();
     RefLogin.dologin(driver); 
     Thread.sleep(2000);
	 Addpro.Section(driver).click();
	 Thread.sleep(2000);
    // Addpro.addBtnPro(driver).click();
    // Thread.sleep(2000);
     Addpro.addProjectname(driver).sendKeys("yes34");
     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
     Thread.sleep(2000);
     Addpro.restrictDomain(driver).sendKeys("@ravabe.com");
     Thread.sleep(2000);
     Addpro.addProjectpeople(driver).sendKeys("Anuj@gmail.com");
     Addpro.addPeopleBtn(driver).click();
     Thread.sleep(2000);
     Addpro.saveproBtn(driver).click();
  }  @Test
  public void testRestrictDomainpeople() throws Exception {
	     driver = new ChromeDriver();
	     RefLogin.dologin(driver); 
	     Thread.sleep(2000);
		 Addpro.Section(driver).click();
		 Thread.sleep(2000);
	    // Addpro.addBtnPro(driver).click();
	    // Thread.sleep(2000);
	     Addpro.addProjectname(driver).sendKeys("yes35");
	     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
	     Thread.sleep(2000);
	     Addpro.restrictDomain(driver).sendKeys("@ravabe.com");
	     Thread.sleep(2000);
	     Addpro.addProjectpeople(driver).sendKeys("anuj@ravabe.com");
	     Addpro.addPeopleBtn(driver).click();
	     Thread.sleep(2000);
	     Addpro.saveproBtn(driver).click();
	  }  @Test
             public void testinternaluser() throws Exception {
		     driver = new ChromeDriver();
		     RefLogin.dologin(driver); 
		     Thread.sleep(2000);
			 Addpro.Section(driver).click();
			 Thread.sleep(2000);
		     Addpro.addProjectname(driver).sendKeys("yes36");
		     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
		     Thread.sleep(2000);
		     Addpro.internalUser(driver).click();
		     Thread.sleep(2000);
		     Addpro.addProjectpeople(driver).sendKeys("anuj@ravabe.com");
		     Thread.sleep(2000);
		     Addpro.addPeopleBtn(driver).click();
		     Thread.sleep(2000);
		     Addpro.saveproBtn(driver).click();
		     Thread.sleep(2000);
		  } @Test
             public void testAddproject() throws Exception {
		     driver = new ChromeDriver();
		     RefLogin.dologin(driver); 
		     Thread.sleep(2000);
			 Addpro.Section(driver).click();
			 Thread.sleep(2000);
		     Addpro.addProjectname(driver).sendKeys("yes37");
		     Addpro.addProjectdisc(driver).sendKeys("Look more professional with a custom Gmail from Google. Start your free trial today");
		     Thread.sleep(2000);
		     Addpro.internalUser(driver).click();
		     Thread.sleep(2000);
		     Addpro.viewOnly(driver).click();
		     Thread.sleep(2000);
		     Addpro.addProjectpeople(driver).sendKeys("anuj@ravabe.com");
		     Thread.sleep(2000);
		     Addpro.addPeopleBtn(driver).click();
		     Thread.sleep(2000);
		     Addpro.saveproBtn(driver).click();
		     Thread.sleep(2000);
		     Addpro.clickpro(driver).click();
		     Thread.sleep(4000);
		  }
	  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  
}
