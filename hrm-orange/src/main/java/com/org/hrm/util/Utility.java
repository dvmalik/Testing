package com.org.hrm.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utility {

	public static WebDriver getDriver(String url) {
		ChromeOptions chroOption = new ChromeOptions();
		chroOption.addArguments("--lang=en") ;
		WebDriver driver;
		driver = new ChromeDriver(chroOption);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void setupLogFilePath(Logger logger , String fileName) throws SecurityException, IOException {
		logger.addHandler(new FileHandler(fileName) );
	}
	
	public static void printStatus(boolean isTrue , String testCaseName) {
		if (isTrue==true) {
			System.out.println(testCaseName+ ": PASS");
		}
		else {
			System.out.println(testCaseName +": FAIL");
		}
	}
}
