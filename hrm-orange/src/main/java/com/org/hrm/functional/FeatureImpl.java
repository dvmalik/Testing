package com.org.hrm.functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.org.hrm.cons.Constant;

public class FeatureImpl implements Feature{

	public boolean testLogin(WebDriver driver, String userName, String password) {
		try {
			// TODO Auto-generated method stub
			driver.findElement(By.name(Constant.USERNAME)).sendKeys(userName);
			driver.findElement(By.name(Constant.PASSWORD)).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath(Constant.LOGIN_XPATH)).click();
			Thread.sleep(3000);
			return true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean testDashboardLabel(WebDriver driver) {
		// TODO Auto-generated method stub
	    String dashboardStr= driver.findElement(By.xpath(Constant.DASHBOARD_XPATH)).getText();
	    if(dashboardStr.equals(Constant.DASHBOARD_STR)) {
	    	   return true;
	       }else {
	    	  return false;
	       }
	}
	public boolean testSiteLabel(WebDriver driver) {
		// TODO Auto-generated method stub
	    String siteLabelStr= driver.findElement(By.xpath(Constant.SITELABEL_XPATH)).getText();
	    if(siteLabelStr.equals(Constant.SITELABEL_STR)) {
	    	   return true;
	       }else {
	    	  return false;
	       }
	}
	

}
