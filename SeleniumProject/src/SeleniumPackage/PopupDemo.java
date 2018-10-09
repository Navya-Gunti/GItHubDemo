package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Selium 3.0/eclipse-jee-mars-1-win32-x86_64/eclipse/demo/popup.htm");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("the title of the page is "+title);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("popup")).click();
		Alert pop=driver.switchTo().alert();
		System.out.println("The message on Pop-Up is" +pop.getText());
		pop.accept();
		

	}

}
