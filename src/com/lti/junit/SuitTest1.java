package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuitTest1 {

	public String message="Raj";
	JunitMessage junitMessage=new JunitMessage(message);
	
	//(expected =ArithmeticException.class)
	//junit exception test 
	@Test
	public void testJunitMessage()
	{
		System.out.println("Just message is printing ");
       junitMessage.printMessage();
	}
	
	@Test
	public void testJunitHiMessage()
	{
		message="Hi!"+message;
		System.out.println("Junit Hi message is printing ");
		assertEquals(message,junitMessage.printHiMessage());
	    System.out.println("Suite Test 1 is succesful "+message);	
	}
	
}