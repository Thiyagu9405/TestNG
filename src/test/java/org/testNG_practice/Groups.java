package org.testNG_practice;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "test1")
	private void test1() {
		System.out.println("Test 1 Completed");
	}
	
	@Test (groups = "test1")
	private void test2() {
		System.out.println("Test 2 Completed");
	}
	
	@Test (groups = "test2")
	private void test3() {
		System.out.println("Test 3 Completed");
	}
	
	@Test (groups = "test2")
	private void test4() {
		System.out.println("Test 4 Completed");
	}
	
	@Test (groups = "test3")
	private void test5() {
		System.out.println("Test 5 Completed");
	}
	
	@Test (groups = "test3")
	private void test6() {
		System.out.println("Test 6 Completed");
	}
	
	
}
