package testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Addpro;

public class Addproject {

	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\Screenshots\\Add_project\\" +System.currentTimeMillis()+ ".png"));
    }
	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		RefDataroom.Dataroom(driver);
		Thread.sleep(2000);
		Addpro.Section(driver).click();
		Thread.sleep(2000);
		Addpro.addBtnPro(driver).click();
		Thread.sleep(2000);
        Addpro.addProjectname(driver).sendKeys("yes1 ");
        Addpro.saveproBtn(driver).click();
        getscreenshot();

}
}
