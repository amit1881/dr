package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addpro {

	private static WebElement element=null;
	
	/*
	 * 
	 */
  //Add project 
	
	public static WebElement Section(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='roomlistheight']/section/div/div[2]/div/div[1]/div[1]/a"));
		   return element;
	   }
	
	 public static WebElement addBtnPro(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='roomlistheight']/section/div/div[2]/div/div[1]/div[1]/a/span"));
		 // element=driver.findElement(By.cssSelector("div.project-add > a.add-btn > span.plscircle > i.glyphicon.glyphicon-plus"));
		   return element;
	   }
	 //Add project name
	 public static WebElement addProjectname(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='dataRoom']"));
		   return element;
	   }
	 //Add discription
	 public static WebElement addProjectdisc(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addProjectroomForm']/div[1]/textarea"));
		   return element;
	   }
	 //Add people 
	 public static WebElement addProjectpeople(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email_value']"));
		   return element;
	   }
	 //Add people button
	 public static WebElement addPeopleBtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='AutocompleteSumit']/div[1]/div/div[1]/span/img"));
		   return element;
	   }
	 
	// Restrict Domain
	 public static WebElement restrictDomain(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='domain_restrict']"));
		   return element;
	   }
	 //internal user
	 public static WebElement internalUser(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addProjectroomForm']/div[2]/div[1]/label"));
		   return element;
	   }
	 //view only
	 public static WebElement viewOnly(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addProjectroomForm']/div[2]/div[2]/label"));
		   return element;
	   }
	 //save btn
	 public static WebElement saveproBtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addProjectroomForm']/button"));
		   return element;
	   }
	 //cancel btn
	 public static WebElement cancelproBtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addProjectroomForm']/a"));
		   return element;
	   }
	 //Click on add project
	 public static WebElement clickpro(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='roomlistheight']/section/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]"));
		   return element;
	   }
}
