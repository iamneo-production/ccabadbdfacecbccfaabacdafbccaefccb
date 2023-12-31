package ai.iamneo.testing.Testing_Selenium_TestNg;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
//Checking the title of iamNeo (Home - iamneo)
	public void testcase_1() throws InterruptedException 
{

		driver.get("http://jqueryui.com/droppable/");
		String title =driver.getTitle();
		Assert.assertEquals(title, "Droppable | jQuery UI");
	}
	/**
	 * @throws InterruptedException
	 */
	@Test
//Moving to FACEBOOK
	public void testcase_2() throws InterruptedException 
	{
	    WebDriver id;
		final WebElement frm=driver.findElement(By.xpath("//"[@id=\"content\"]/iframe));"
		driver.switchTo().frame(frm);
		final WebElement source =driver.findElement(By.id("draggable"));
		WebElement destination =driver.findElement(By.id("droppable"));
		Actions act =new Actions(driver);
		act.dragAndDrop(source,destination).build().perform();
		final WebElement text=driver.findElement(By.xpath("//[@id=\"droppable\"/p"])); 	
		 String get =text.getText();
		Assert.assertEquals(get,"Dropped!");

	}
	/**
	 * 
	 */
	@Test
//Back to iamNeo
	public void testcase_3() throws InterruptedException 
	{
		 WebElement destination =driver.findElement(By.id("droppable"));
		 String clr=destination.getCssValue("color");
		 String color =Color.fromString(clr).asHex();;
		 Assert.assertEquals(color, "#777620");

	}
	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}
