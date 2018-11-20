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
		for (int i=0;i<2;i++){
			try{
				if(i == 0){
					driver.get("http://www.michaeljacksion.com");
				}else{
					driver.get("http:/www.ltn.com.tw");
				}
		        File scrFile1 = ( (TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
		        String pngname = "D:\\test-"+i+".png";
		        FileUtils.copyFile(scrFile1, new File(pngname));
		        //driver.quit();
			} catch (Exception e){
				continue;
				//driver.close();
			    //e.printStackTrace();
			    //throw new IllegalStateException(e);
			}
		}
		driver.close();
			

		
		
	}

}
