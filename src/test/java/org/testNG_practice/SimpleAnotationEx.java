package org.testNG_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnotationEx {

	@BeforeSuite
	private void webdriverLaunch() {
		System.out.println("Webdriver Launched");
	}
	
	@BeforeTest
	private void url() {
		System.out.println("Entered URL");
	}
		
	@BeforeClass
	private void sigIn() {
		System.out.println("SignIn sucess full");
	}

	@BeforeMethod
	private void homePage() {
		System.out.println("Went to Home Page");
	}
	
	@Test
	private void test1() {
		System.out.println("Test 1 Completed");
	}
	
	@Test
	private void test2() {
		System.out.println("Test 2 Completed");
	}
	
	@Test
	private void test3() {
		System.out.println("Test 3 Completed");
	}
	
	@AfterMethod
	private void signOut() {
		System.out.println("Sign Out Sucessfully");
	}
	
	@AfterClass
	private void closeWindow() {
		System.out.println("Window Closed");
	}
	
	@AfterTest
	private void clearCookies() {
		System.out.println("Cookies Cleared");
	}
	
	@AfterSuite
	private void endofProgram() {
		System.out.println("THE END");
	}
}
