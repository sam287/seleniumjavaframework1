package demo;

import org.testng.annotations.Test;

public class testngdependencydemo {
	
	@Test(dependsOnGroups = {"sanity1"})
	public void test1 ( ) {
		System.out.println("I am inside Test1");
	}
	@Test(groups = {"sanity1"})
	public void test2( ) {
		System.out.println("I am inside Test2");
	}
	
	@Test
	public void test3( ) {
		System.out.println("I am inside Test3");
	}
}
