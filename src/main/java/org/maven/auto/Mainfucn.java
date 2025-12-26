package org.maven.auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mainfucn extends Baseclass {
	public static void main(String[] args) throws IOException {
		driverlaunch("edge");
		urlenter("https://www.taskrabbit.com/");
		timeout(10);
		WebElement wb=driver.findElement(By.xpath("//input[@name='search']"));
		send(wb,"venkateswaran");
		shot("taskrabbit");
		timeout(10);
		exit();
		
	}

}
