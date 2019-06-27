package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest() {
		String expectedName="Ashu";
		assertEquals(expectedName,Employee.getEmpNameWithHighestSalary());
		}
	
 	@Test
   	public void myObjectEqualsTest() {
		Employee expectedEmpObj=new Employee(1,"Ashu",15000);
		//Comparing the above input to the Employee.java class in the below statement
		assertEquals(expectedEmpObj,Employee.getHighestPaidEmployee());
	}

}