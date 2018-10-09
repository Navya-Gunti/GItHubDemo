package SeleniumPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import java.util.*;
public class Demo {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	  
	  driver.findElement(By.name("passCount")).sendKeys("4");
	  WebElement from=driver.findElement(By.name("fromPort"));
	  Select sel=new Select(from);
	  java.util.List<WebElement> list=sel.getOptions();
	  for(WebElement e:list)
	    {
		  String city=e.getText();
		  if(city.equals("Paris"))  
		  {
			  sel.selectByValue(city);
			  break;
		  }
		
	    }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
