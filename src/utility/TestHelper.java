package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestHelper {
           
	private static WebElement element=null;
	  
	   /*
	    * Login
	    */
	   //Email address
	  public static WebElement EmailAddress(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email']"));
		   return element;
	   }
	  
	  //Password
	  
	  public static WebElement LoginPassword(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='password']"));
		   return element;
	   }
	   //Check box
	  
	  public static WebElement Checkbox(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='login-form']/div/div/label/input[2]"));
		   return element;
	   }
	  
	   //Login Button
	  
	   public static WebElement Login(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='login-form']/div/button"));
		   return element;
	   }
	   

}
