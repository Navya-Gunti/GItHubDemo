package SeleniumPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTest {
	 WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.linkText("REGISTER")).click();
 driver.findElement(By.name("firstName")).sendKeys("navya");
 driver.findElement(By.name("lastName")).sendKeys("gunti");
 driver.findElement(By.name("phone")).sendKeys("9876543210");
 driver.findElement(By.id("userName")).sendKeys("navya123");
 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("netaji nagar");
 driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input")).sendKeys("champapet");
 driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > input")).sendKeys("hyderabad");
 driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(10) > td:nth-child(2) > input")).sendKeys("telangana");
 driver.findElement(By.name("postalCode")).sendKeys("500017");
 driver.findElement(By.name("country")).sendKeys("INDIA");
 driver.findElement(By.id("email")).sendKeys("navya123");
 driver.findElement(By.cssSelector("")).sendKeys("");
 driver.findElement(By.cssSelector("")).sendKeys("");
 driver.findElement(By.name("register")).click();
 Assert.assertEquals(driver.getTitle(),"Register: Mercury Tours");

  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
