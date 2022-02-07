package com.Test_actiTIME.testcases;

import org.testng.annotations.Test;

import com.Test_actiTIME.pageobjectmodel.Login;

public class Testcase_TC_3 extends BaseClass {
	@Test
	public void test_Login()
	{
		Login login = new Login(driver);
		login.setUsername(userName);
		login.setPassword(Password);
		login.clickLogin();
	}
}
