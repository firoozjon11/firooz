package Selenium;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {

public static WebDriver driver = null;
public static WebDriverWait waitVar = null;

public static String baseURL = "https://www.magicleap.com";

public void createDriver() throws MalformedURLException,
InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\owner\\Downloads\\chromedriver_win32\\chromedriver.exe");

driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

driver.get(baseURL);

waitVar = new WebDriverWait(driver, 15);
}

public void teardown() {
driver.quit();
}

//@SuppressWarnings("deprecation")
public void ishomepageDisplayed() {

	try{
      if(driver.getPageSource().contains("Magic Leap One CREATOR EDITION"));
       
    } catch(Exception e){
    }
  
driver.findElement(By.cssSelector("#header-nav-logo-container > svg")).isDisplayed(); 
}

public void iscontactFormDisplayed() {
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.cssSelector("#home-sign-up")));

}

public void scrollDown() {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,252)", "");
}

public void fillOutContacform() {

	driver.findElement(By.xpath("//*[@id=\"footer_email\"]")).sendKeys("firooz@mailinator.com");
	driver.findElement(By.xpath("//*[@id=\"footer_nickname\"]")).sendKeys("Firooz Yazdi");
	driver.findElement(By.xpath("//*[@id=\"footer_i_am_a\"]")).isSelected();
}

public void clickSubmitButton() {
driver.findElement(By.cssSelector("#footer-submit-button > div")).click();
}

public void isContactmsgDisplayed() {

	boolean textPresent = driver.findElement(By.cssSelector("#cta-thanks-text")).isDisplayed();
}

public void refreshHP() {
	driver.navigate().refresh();
}
public boolean txtIsnotDisplayed() {
		
try {
   if(driver.getPageSource().contains("Calling all developers"));
} catch (Exception e)
   {
   System.out.println("Calling for developes is present");
   return false;
   }
    {
	   System.out.println("Calling for developes is not present");
	   return true;
}
		}

		}
	


 