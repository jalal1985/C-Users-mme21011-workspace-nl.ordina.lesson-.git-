package nl.ordina.lesson.webbasedSap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SeleniumFindElement  {
	
	
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
      java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
      java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
        WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("https://ordsap202.beheer.lan:44310/nwbc/?sap-nwbc-node=root&sap-client=100&sap-language=EN&sap-theme=sap_corbu");
        
        WebElement username = driver.findElement(By.id("sap-user"));
        username.click();
        username.sendKeys("mme21011");
        WebElement password = driver.findElement(By.id("sap-password"));
        password.click();
        password.clear();
        
        password.sendKeys("Greenpeace_1985");
       
       // driver.findElement(By.id("sap-password")).sendKeys("Greenpeace_1985");
        // driver.findElement(By.cssSelector("input[type=’password’][name=’sap-password’]")).sendKeys("Greenpeace_1985");
        //driver.findElement(By.cssSelector("input#sap-password.urEdf2TxRadius.urEdf2TxtEnbl.urBorderBox")).sendKeys("Greenpeace_1985");
     //   driver.findElement(By.className("urEdf2Whl")).sendKeys("Greenpeace_1985");
      WebElement button = driver.findElement(By.id("LOGON_BUTTON"));
      button.click();
      // pushing Logon button 
      WebElement continueButton = driver.findElement(By.id("SESSION_QUERY_CONTINUE_BUTTON"));
      if(continueButton != null){
      	continueButton.click();
      }

      WebElement element2 = driver.findElement(By.cssSelector("#ul_nav_1 li:nth-child(4) a"));
      element2.click();
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
     
      // webdriver pushing button CreateFSRequest
	  WebElement CreateFSRequest= driver.findElement(By.id("WD51"));
	  CreateFSRequest.click();
	  
	  WebElement entryTest = driver.findElement(By.id("WD01D1"));
      entryTest.clear();
      entryTest.click();
      entryTest.sendKeys("Invoer gegevens");

      
      System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    
        
        //Selenioum ide

    }
    }