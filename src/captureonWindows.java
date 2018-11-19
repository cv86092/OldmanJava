import java.io.File;
import java.io.IOException;

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
		driver.get("https://www.sex.com");
        File scrFile = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\20181119.png"));
		driver.quit();
	}

}
