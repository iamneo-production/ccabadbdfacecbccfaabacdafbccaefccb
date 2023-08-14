package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;
	private By xpath;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
//Checking the title of iamNeo (Home - iamneo)
	public void testcase_1() throws InterruptedException 
	{

		 String title =driver.getTitle();
		Assert.assertEquals(title, "Droppable | jQuery UI");
	}
	@Test
//Moving to FACEBOOK
	public void testcase_2() throws InterruptedException 
	{
		WebDriver id;
        String frm;
		xpath = By.xpath("//"[@id=\"content\"]/iframe));"
		driver.switchTo().frame(frm);
		WebElement frm=driver.findElement(xpath;
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement destination =driver.findElement(By.id("droppable"));
		Actions act =new Actions(driver);
		act.dragAndDrop(source,destination).build().perform();
		WebElement text=driver.findElement(By.xpath("//[@id=\"droppable\"/p"])); 	
		 String get =text.getText();;
		String title;
		Assert.assertEquals(title, "Dropped!");

	}
	@Test
//Back to iamNeo
	public void backPage() throws InterruptedException 
	{
		 String clr
		 String color =Color.fromString(clr).asHex();;
		 Assert.assertEquals(title, "");

	}
	@Test
//Current URL
public void currentURL() throws InterruptedException 
{
		 String title ="Get your title";
		Assert.assertEquals(title, "");

}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}
