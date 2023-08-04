package com.org.hrm.main;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.org.hrm.cons.Constant;
import com.org.hrm.util.Utility;

public class HrmTestMain {

	public static void main(String[] args) throws InterruptedException, SecurityException, IOException {
		// TODO Auto-generated method stub
		Logger log = Logger.getAnonymousLogger();
		Utility.setupLogFilePath(log, Constant.LOG_FILE_PATH);
		
	
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String userName = "Admin";
		String password = "admin123";

		WebDriver driver = Utility.getDriver(url);
		Thread.sleep(1000);
		
		driver.findElement(By.name(Constant.USERNAME)).sendKeys(userName);
		driver.findElement(By.name(Constant.PASSWORD)).sendKeys(password);
		Thread.sleep(1000);
		
        driver.findElement(By.xpath(Constant.LOGINXPATH)).click();
	}

}
