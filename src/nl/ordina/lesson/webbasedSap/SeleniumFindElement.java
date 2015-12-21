package nl.ordina.lesson.webbasedSap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class SeleniumFindElement {

	public static void main(String[] args) throws InterruptedException {

		java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
		java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://ordsap202.beheer.lan:44310/nwbc/?sap-nwbc-node=root&sap-client=100&sap-language=NL&sap-theme=sap_corbu");
		Map<String, WebDriver> webDrivers = new HashMap<String, WebDriver>();
		webDrivers.put("\n" + "Firefox Driver", driver);
		List<SourcingInterface> functionalTests = new ArrayList<SourcingInterface>();
		SourcingLogin login = new SourcingLogin(
				"https://ordsap202.beheer.lan:44310/nwbc/?sap-nwbc-node=root&sap-client=100&sap-language=NL&sap-theme=sap_corbu");
		functionalTests.add(login);

		for (Entry<String, WebDriver> entry : webDrivers.entrySet()) {
			System.out.println("Data insertion in class " + "\n" + entry.getClass());

			for (SourcingInterface functionalTest : functionalTests) {
				functionalTest.getClass().getSimpleName();

				try {
					functionalTest.test(entry.getKey(), entry.getValue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				{
					login.setLoginCredentials("MME21011", "Greenpeace_1985");
					login.getSourcing("MME21011", "Greenpeace_1985", driver);
					login.continueButton(driver);
					login.clickOnResourcePlanningButton(driver);
					login.clickOnCreateFSRequest(driver);
					login.clientDetails(driver);
					login.clickOnRolTab(driver);
					login.rolDetails(driver);
					login.timeRules(driver);
					login.requiredCompetences(driver);
					login.clickOnCandidatesTab(driver);
					login.addCandidates(driver);
					
				}

				System.out.println("Data Inserted" + "\n" + entry.getValue());

			}
		}
	}
}

// jaxb importing data
// driver.findElement(By.id("sap-password")).sendKeys("Greenpeace_1985");
// driver.findElement(By.cssSelector("input[type=’password’][name=’sap-password’]")).sendKeys("Greenpeace_1985");
// driver.findElement(By.cssSelector("input#sap-password.urEdf2TxRadius.urEdf2TxtEnbl.urBorderBox")).sendKeys("Greenpeace_1985");
// driver.findElement(By.className("urEdf2Whl")).sendKeys("Greenpeace_1985");

// Selenioum ide
