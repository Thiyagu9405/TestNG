package org.testNG_practice;

import org.testng.annotations.Test;

public class Ignore {
	
	@org.testng.annotations.Ignore
	@Test
	private void test1() {
		System.out.println("Test 1 Completed");
	}
	
	@Test(enabled = false)
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
	
	
}
