package SeleniumPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Test_me_app_action_example {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
			 driver=new ChromeDriver();
	  }
	
  @Test(priority=1,enabled=true)
  public void cart() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get("https://www.allstate.com/");
		  WebElement mainMenu=driver.findElement(By.xpath("/html/body"));
		  
	Actions actions=new Actions(driver);
	  actions.moveToElement(mainMenu);
	  WebElement subMenu=driver.findElement(By.xpath("/html/body"));
	  actions.moveToElement(subMenu);
	  actions.click().build().perform();
	  
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
