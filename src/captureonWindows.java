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

import com.google.common.io.*;


public class captureonWindows {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Michael\\AppData\\Roaming\\java\\geckodriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("marionatte", false);
		FirefoxOptions opt = new FirefoxOptions();
		opt.merge(dc);
		FirefoxDriver driver =  new FirefoxDriver(opt);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://www.bot.com.tw/");
        File scrFile1 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile1, new File("D:\\20181120-1.png"));
		driver.get("http://www.ltn.com.tw/");
        File scrFile2 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("D:\\20181120-2.png"));
		
		driver.get("http://www.michaeljacksion.com/");
        File scrFile3 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile3, new File("D:\\20181120-3.png"));
        
		driver.get("http://www.cpbl.com.tw/");
        File scrFile4 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile4, new File("D:\\20181120-4.png"));
        
		driver.get("http://www.wix.com/");
        File scrFile5 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile5, new File("D:\\20181120-5.png"));
        
		driver.quit();
	}

}
