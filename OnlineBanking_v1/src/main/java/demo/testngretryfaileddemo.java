package demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class testngretryfaileddemo {

	@Test
	public void test1( ) {
		System.out.println("i am inside test1");
	}
	
	@Test
	public void test2( ) {
		System.out.println("i am inside test2");
		
		//int i = 1/0;
	}
	@Test  (retryAnalyzer = listners.failedretrydemo.class)
	public void test3( ) { 
		System.out.println("i am inside test3");
		Assert.assertTrue(0>1);
	}
}
