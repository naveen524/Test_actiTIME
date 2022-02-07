package com.Test_actiTIME.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public String baseURL="https://demo.actitime.com/login.do";
	public String userName="admin";
	public String Password="manager";
	public static WebDriver driver;

	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void tearDown()
	{
		driver.close();
	}
}
