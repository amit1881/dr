package testcases;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.TestHelper;

public class Login {

	public static  WebDriver driver;
	public static void getscreenshot() throws Exception 
    {
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with name "screenshot.png"
            FileUtils.copyFile(scrFile, new File("D:\\Screenshots\\Dataroom_Login\\" +System.currentTimeMillis()+ ".png"));
    }
	  public static void main(String[] args) throws Exception {
		  
		// TODO Auto-generated method stub
          
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.navigate().to("http://test.ravabe.com/dataroom/");
	      driver.manage().window().maximize();
	     
	      System.out.print("Would you like to continue(yes/no)::");
	 	  InputStreamReader isr=new InputStreamReader(System.in);
	 	  BufferedReader brd=new BufferedReader(isr);
	 	  String str=brd.readLine();
	 	  while(str.equals("yes")){
	 	  InputStreamReader input= new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(input);
	      System.out.print("Enter Title choice::");
	      String choice=br.readLine();
	 		 switch(choice.toLowerCase()){
	 		
	 		 case "1":{
	 			  TestHelper.EmailAddress(driver).sendKeys("amit@ravabe.com");
	 		      TestHelper.LoginPassword(driver).sendKeys("Amit1234");
	 		      TestHelper.Login(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		 case "2":{
	 			  TestHelper.EmailAddress(driver).sendKeys("");
	 		      TestHelper.LoginPassword(driver).sendKeys("Amit1234");
	 		      TestHelper.Login(driver).click();
	 		      Thread.sleep(4000);
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		 case "3":{
	 			  TestHelper.EmailAddress(driver).sendKeys("xyz");
	 		      TestHelper.LoginPassword(driver).sendKeys("Amit1234");
	 		      TestHelper.Login(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "4":{
	 			  TestHelper.EmailAddress(driver).sendKeys("amit@ravabe.com");
	 		      TestHelper.LoginPassword(driver).sendKeys("");
	 		      TestHelper.Login(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "5":{
	 			  TestHelper.EmailAddress(driver).sendKeys("amit@ravabe.com");
	 		      TestHelper.LoginPassword(driver).sendKeys("amit");
	 		      TestHelper.Login(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		case "6":{
	 			  TestHelper.EmailAddress(driver).sendKeys("amit@ravabe.com");
	 		      TestHelper.LoginPassword(driver).sendKeys("Amit1234");
	 		      TestHelper.Checkbox(driver).click();
	 		      TestHelper.Login(driver).click();
	 		      getscreenshot();
	 		      break; 
	 		 }
	 		}
	 		 System.out.print("Would you like to continue with event::");
	 		 InputStreamReader isrd=new InputStreamReader(System.in);
	 		 BufferedReader brdr=new BufferedReader(isrd);
	 		 str=brdr.readLine();
	 		 if(str.equals("no")){
	 			 System.out.println("ok, thanks");
	 		 } 
	    } //End while 
	 	  
	 }//End main
	  

}//End class

