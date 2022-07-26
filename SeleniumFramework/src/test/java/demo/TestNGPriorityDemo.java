package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	
	@Test(priority = 1)
	public void unique() {
		System.out.println("I am inside unique set with priority 1  -->1");
		
	}
	
	@Test()
     public void alphabet() {
		System.out.println("I am inside alphabet set with no priority  -->2");
		
	}
	
	@Test(priority = 1)
     public void subject() {
		System.out.println("I am inside subject set with priority 1  -->3");
 	}
	
	@Test()
    public void cat() {
		System.out.println("I am inside cat set with no priority   -->4");
	}
	
	@Test(priority = 2)
    public void ant() {
		System.out.println("I am inside ant set with priority 2  -->5");
	}
}

//Priority

/* 

 priority stars from lower number to highest
 if no priority number is given, methods run in alphabetical order of method name
 if some are given priority and others are not given ,execution starts from non priority methods 
 if two or more methods have same priority ,methods are run in alphabetical order
 
 */
