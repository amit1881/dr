package testcases;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.AddDatarm;
import utility.ReadExcel;

public class EditDataroom {
	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //The below method will save the screen shot 
            FileUtils.copyFile(scrFile, new File("E:\\Screenshots\\Add_dataroom\\" +System.currentTimeMillis()+ ".png"));
    }
	public static String description="Social media are computer-mediated tools that allow people, companies and other organizations to create, share, or exchange information, career interests, ideas, and pictures/videos in virtual communities and networks.";
	 @DataProvider(name="email")
	   
	    public Object[][] SendUserEmail() throws Exception{
	 
	         Object[][] testObjArray = ReadExcel.getTableArray("C://Users//amit 1//workspace-mars//dr//TestData//email-formats.xlsx","Sheet1");
	 
	         return (testObjArray);
	 
			}
  @Test(dataProvider="email")
  public void f(String email) throws Exception {
	  driver = new ChromeDriver();
	  RefLogin.dologin(driver);
	  AddDatarm.addBtn(driver).click();
	  AddDatarm.dataroomName(driver).sendKeys("twitter");
	  AddDatarm.dataroomDiscription(driver).sendKeys(description);
	  AddDatarm.addPeople(driver).sendKeys(email);
	  Thread.sleep(3000);
	  AddDatarm.addPeopleBtn(driver).click();
	  Thread.sleep(2000);
	  ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  getscreenshot();
	  AddDatarm.addPeople(driver).clear();
	  AddDatarm.saveBtn(driver).click();
	  Thread.sleep(3000);
  }
}
