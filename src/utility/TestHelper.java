package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestHelper {
           
	private static WebElement element=null;
	private static String emailXpath;
	private static String passwordXpath;
	
	public static void getPageElements(){
		Properties prop = new Properties();
		InputStream input= null;

		try {

			input = new FileInputStream("C://Users//amit 1//workspace-mars//dr//src//properties//login-elements.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			//System.out.println(prop.getProperty("email-xpath"));
			//System.out.println(prop.getProperty("password-xpath"));
			
			//get the property value
			emailXpath=prop.getProperty("email-xpath");
			passwordXpath=prop.getProperty("password-xpath");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	static {
	    getPageElements();
	  }
	   /*
	    * Login
	    */
	   //Email address
	  public static WebElement EmailAddress(WebDriver driver)
	   {
		   
		   //element=driver.findElement(By.xpath(".//*[@id='email']"));
		   element=driver.findElement(By.xpath(emailXpath));
		   return element;
	   }
	  
	  //Password
	  
	  public static WebElement LoginPassword(WebDriver driver)
	   {
		   
		   //element=driver.findElement(By.xpath(".//*[@id='password']"));
		   element=driver.findElement(By.xpath(passwordXpath));
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
