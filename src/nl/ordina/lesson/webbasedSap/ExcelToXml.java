package nl.ordina.lesson.webbasedSap;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Logger;
import javax.xml.xpath.XPathExpressionException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;
/*

public class ExcelToXml {

	private static final Logger logger = Logger.getLogger(XmlUtils.class);

	public void startTestScript(WebDriver driver)
			throws SAXException, IOException, XPathExpressionException, MessagingException {

		try {

			// loading data from XML
			XmlUtils.readXmlData();

			logger.info(" *** PASS - Starting test script *** ");
			driver.findElement(By.name("login_username")).clear();
			driver.findElement(By.name("login_username"))
					.sendKeys("" + XmlUtils.retrieveElementByXMLtag("//userlogin//username"));
			driver.findElement(By.name("secretkey")).clear();
			driver.findElement(By.name("secretkey"))
					.sendKeys("" + XmlUtils.retrieveElementByXMLtag("//userlogin//password"));
			driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

			// taking screendump to see what page is displayed
			new DumpUtils().TakeScreendump();

			// send mail
			new SendLeafMail().SendOutMail();
			logger.info(" *** PASS - End test script *** ");

		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
		}
	}
}
*/
