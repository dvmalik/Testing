package com.org.hrm.functional;

import org.openqa.selenium.WebDriver;

public interface Feature {

	public boolean testLogin(WebDriver driver, String userName, String password);
	public boolean testDashboardLabel(WebDriver driver);
	public boolean testSiteLabel(WebDriver driver);
		
	
	
}
