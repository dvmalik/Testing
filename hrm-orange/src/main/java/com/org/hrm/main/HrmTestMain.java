package com.org.hrm.main;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.org.hrm.cons.Constant;
import com.org.hrm.functional.Feature;
import com.org.hrm.functional.FeatureImpl;
import com.org.hrm.util.Utility;

public class HrmTestMain {

	public static void main(String[] args) throws InterruptedException, SecurityException, IOException {
		Logger log = Logger.getAnonymousLogger();
		Utility.setupLogFilePath(log, Constant.LOG_FILE_PATH);

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String userName = "Admin";
		String password = "admin123";

		WebDriver driver = Utility.getDriver(url);
		Thread.sleep(1000);
		Feature feature = new FeatureImpl();
		// test case 1
		boolean featureTestLogin = feature.testLogin(driver, userName, password);
		Utility.printStatus(featureTestLogin, "Test Case 1: testLogin");

		// test case 2
		boolean featureDashBordLabel = feature.testDashboardLabel(driver);
		Utility.printStatus(featureTestLogin, "Test Case 2: testDashboardLabel");

		// test case 3
		boolean featureSiteLabel = feature.testSiteLabel(driver);
		Utility.printStatus(featureSiteLabel, "Test Case 3: testSiteLabel");
	}

}
