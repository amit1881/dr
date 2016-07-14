package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDatarm {

	private static WebElement element=null;
      

	   /*
	    * add dataroom
	    */
	  public static WebElement addBtn(WebDriver driver)
	   {
		  element=driver.findElement(By.xpath(".//*[@id='roomlistheight']/section/div/div[1]/div/div[1]/a/span"));
		
		   return element;
	   }
	  /*
	   * delete dataroom
	   */
	  public static WebElement settingLink(WebDriver driver){
		  element=driver.findElement(By.xpath(".//*[@id='data-1254']/div[2]/div/a/img"));
		  return element;
	  }
	  public static WebElement deleteLink(WebDriver driver){
		  element=driver.findElement(By.xpath(".//*[@id='data-1254']/div[3]/ul/li[4]/a"));
		  return element;
	  }
	  //dataroom name
	  
	  public static WebElement dataroomName(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='dataRoom']"));
		   return element;
	   }
	  //dataroom discription
	  public static WebElement dataroomDiscription(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addDataroomForm']/div[1]/textarea"));
		   return element;
	   }
	  //Add people
	  public static WebElement addPeople(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email_value']"));
		   return element;
	   }
	  //ADD PEOPLE BUTTON
	  public static WebElement addPeopleBtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='AutocompleteSumit']/div[1]/div/div[1]/span/img"));
		   return element;
	   }
	  //Restrict Domain
	  public static WebElement restrictDomain(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='domain_restrict']"));
		   return element;
	   }
	  //internal user only
	  public static WebElement internalUser(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addDataroomForm']/div[2]/div[1]/label"));
		   return element;
	   }
	  //View Only
	  public static WebElement viewOnly(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addDataroomForm']/div[2]/div[2]/label"));
		   return element;
	   }
	  //save dataroom
	  public static WebElement saveBtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addDataroomForm']/button"));
		   return element;
	   }
	  //Cancel dataroom Btn
	  
	  public static WebElement cancelBtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='addDataroomForm']/a"));
		   return element;
	   }
}
