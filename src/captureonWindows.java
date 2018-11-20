import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.*;

//guava-18 , selenium-2.45 , firefox 63 ,geckoDriver 23

public class captureonWindows {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Michael\\AppData\\Roaming\\java\\geckodriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("marionatte", false);
		FirefoxOptions opt = new FirefoxOptions();
		opt.merge(dc);
		FirefoxDriver driver =  new FirefoxDriver(opt);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try{
			driver.get("http://www.michaeljacksion.com/");
	        File scrFile1 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile1, new File("D:\\20181120-1.png"));
	        driver.quit();
		} catch (Exception e){
			driver.close();
			throw new RuntimeException("Failed to start firefox browser,please check!", e);
		}
		
		driver.get("http://www.ltn.com/");
        File scrFile2 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("D:\\20181120-1.png"));
			

		
		
	}

}
