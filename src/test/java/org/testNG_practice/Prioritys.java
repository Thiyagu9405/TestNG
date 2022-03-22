package org.testNG_practice;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Prioritys {

	@Ignore
	@Test (priority = 1)
	private void test1() {
		System.out.println("Test 1 Completed");
	}
	
	@Test (priority = 5)
	private void test2() {
		System.out.println("Test 2 Completed");
	}
	
	@Test (priority = 0)
	private void test3() {
		System.out.println("Test 3 Completed");
	}
	
	@Test (priority = 4)
	private void test4() {
		System.out.println("Test 4 Completed");
	}
	
	@Test (priority = 1)
	private void test5() {
		System.out.println("Test 5 Completed");
	}
	
	@Test (priority = 2)
	private void test6() {
		System.out.println("Test 6 Completed");
	}
	
	
}
