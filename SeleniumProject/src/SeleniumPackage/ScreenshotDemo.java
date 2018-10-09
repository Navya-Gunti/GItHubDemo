package SeleniumPackage;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)objDrv;
		
		File sr=ts.getScreenshotAs(OutputType.File);
		FileUtils.copyFile(sr,new File("./screenshot/google.png"));
		System.out.println("acreenshot taken");
	}

}
