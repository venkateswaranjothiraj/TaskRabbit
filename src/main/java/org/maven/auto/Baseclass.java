package org.maven.auto;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass {
	public static WebDriver driver;
	public static void driverlaunch(String name) {
		if(name.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if(name.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.err.println("invalid browser input");
		}
	}
	public static void urlenter(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void timeout(int sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	}
	public static void send(WebElement wb,String valu) {
		wb.sendKeys(valu);
	}
	public static void shot(String loc) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\venka\\OneDrive\\Documents\\Venkateswaran ANUDIP\\org.maven.auto\\src\\test\\resources\\screenshot"+loc+".png"); 
		FileUtils.copyFile(src, dest);
	}
	public static void exit() {
	driver.quit();  
	}
	 
	
}


		

	




