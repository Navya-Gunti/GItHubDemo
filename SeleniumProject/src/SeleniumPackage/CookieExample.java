package SeleniumPackage;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class CookieExample {

	@Test(priority=1,enabled=true)
	public void login() {
		 System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Cookie cookie=new Cookie("username","navya");
		driver.manage().addCookie(cookie);
		Set<Cookie> cookie_set=driver.manage().getCookies();
		for(Cookie temp_cookie:cookie_set){
			System.out.println("Name of the cookie:"+temp_cookie.getName()+
					"and its value:"+temp_cookie.getValue()
					+"get domain:"+temp_cookie.getDomain()
					+"get path:"+temp_cookie.getPath()
					+"get expiry date:"+temp_cookie.getExpiry()+"is secure:"+temp_cookie.isSecure());
			driver.manage().deleteCookie(cookie);
		
		}

  }

  

  @AfterTest
  public void afterTest() {
  }

}
