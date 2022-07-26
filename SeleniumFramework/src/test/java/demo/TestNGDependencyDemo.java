package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups = {"sanity"})
	public void test4() {
		System.out.println("I am inside Test 4");
	}
	
	@Test(groups = {"sanity"})
	public void test5() {
		System.out.println("I am inside Test 5");
	}
	
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
	}
	
	
	
	
}

/*

priority gets executed last, irrespective of depends on ,based on conditions
depends on gets executed first
first,  dependsOnmethods gets executed followed by dependsOnGroups
*/