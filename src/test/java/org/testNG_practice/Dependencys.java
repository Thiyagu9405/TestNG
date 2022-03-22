package org.testNG_practice;

import org.testng.annotations.Test;

public class Dependencys {

	
	@Test (dependsOnMethods = "test4")
	private void test1() {
		System.out.println("Test 1 Completed");
	}
	
	@Test (dependsOnMethods = "test3")
	private void test2() {
		System.out.println("Test 2 Completed");
	}
	
	@Test 
	private void test3() {
		System.out.println("Test 3 Completed");
	}
	
	@Test 
	private void test4() {
		System.out.println("Test 4 Completed");
	}
	
//	@Test 
//	private void test5() {
//		System.out.println("Test 5 Completed");
//	}
//	
//	@Test (dependsOnMethods = "test2")
//	private void test6() {
//		System.out.println("Test 6 Completed");
//	}
	
}
