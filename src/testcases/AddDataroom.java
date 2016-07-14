package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.AddDatarm;
public class AddDataroom {

	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\Screenshots\\Add_dataroom\\" +System.currentTimeMillis()+ ".png"));
    }
	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
        RefLogin.dologin(driver);
        AddDatarm.addBtn(driver).click();
        AddDatarm.dataroomName(driver).sendKeys("my first atuomation test");
        AddDatarm.saveBtn(driver).click();
        getscreenshot();

	}

}
