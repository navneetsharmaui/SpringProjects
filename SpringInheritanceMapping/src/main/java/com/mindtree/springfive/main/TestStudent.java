/**
 * 
 */
package com.mindtree.springfive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.springfive.beans.EnggStudent;

/**
 * @author M1044357
 *
 */
public class TestStudent {

	/**
	 * @param args
	 */
	@SuppressWarnings({"resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		EnggStudent enggStudentOne = (EnggStudent) applicationContext.getBean("objTwo");
		
		System.out.println(enggStudentOne.getRollNo()+" "+enggStudentOne.getStudentName()+" "+enggStudentOne.getBranchCode()+" "+enggStudentOne.getCollegeCode());

		EnggStudent enggStudentTwo = (EnggStudent) applicationContext.getBean("objThree");
		
		System.out.println(enggStudentTwo.getRollNo()+" "+enggStudentTwo.getStudentName()+" "+enggStudentTwo.getBranchCode()+" "+enggStudentTwo.getCollegeCode());
		
		// Student is abstract.
		/*Student student = (Student) applicationContext.getBean("objOne");
		
		System.out.println(student.getRollNo()+" "+student.getStudentName());*/
	}

}
