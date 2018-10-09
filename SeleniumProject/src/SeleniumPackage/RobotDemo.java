package SeleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class RobotDemo {

	public static void main(String[] args) throws AWTException{
		Robot robot=new Robot();
		System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open page
		driver.get("file:///C:/Users/training_c2a.05.01/workspace/SeleniumProject/src/SeleniumPackage/fileupload.html");
				driver.findElement(By.xpath("/html/body/input")).click();
				robot.setAutoDelay(1000);
				String path="C:\\Selium 3.0\\xlsheet\\Book1.xlsx";
				StringSelection sel=new StringSelection(path);
				
				//copy clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				robot.setAutoDelay(1000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
				robot.setAutoDelay(1000);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				
				

	}

}
