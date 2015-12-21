package nl.ordina.lesson.webbasedSap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public interface SourcingInterface {

	public void test(String url, WebDriver driver) throws Exception;

	public String getUrl();

	
	}



/*
 * 
 * import org.openqa.selenium.WebDriver;
 * 
 * import com.relevantcodes.extentreports.ExtentReports;
 * 
 * // functional test interface which public interface InterfaceIntegrationTest
 * { static final ExtentReports extent =
 * ExtentReports.get(IntegrationTest.class);
 * 
 * public void test(String browserVersion, WebDriver webDriver) throws
 * Exception;
 * 
 * public String getURL();
 * 
 * }
 * 
 * 
 * 
 * 
 */