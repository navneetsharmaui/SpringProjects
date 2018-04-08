/**
 * 
 */
package com.mindtree.manager;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author M1044357
 *
 */
public class Manager {
	public boolean isDouble(String stringDouble) {
		boolean bool = Pattern.compile("^-?\\d*\\.\\d+$|^-?\\d+$").matcher(stringDouble).find();
		return bool;
	}
	
	public boolean isInteger(String stringInteger) {
		boolean bool = Pattern.compile("^\\d+$").matcher(stringInteger).find();
		if (bool && stringInteger.length()>9) {
			bool=false;
		}
		return bool;
	}
	
	public boolean isString(String stringOne) {
		boolean bool = Pattern.compile("^[A-Za-z ]++$").matcher(stringOne).find();
		return bool;
	}
	
	public boolean isEmail(String stringEmail) {
		boolean bool = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", Pattern.CASE_INSENSITIVE).matcher(stringEmail).find();
		return bool;
	}
	
	public boolean isDate(String stringDate) {
		boolean bool = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$", Pattern.CASE_INSENSITIVE).matcher(stringDate).find();
		return bool;
	}
	
	public boolean isPhoneNumber(String stringPhoneNumber) {
		boolean bool = Pattern.compile("((\\+*)((0[ -]+)*|(91 )*)(\\d{12}+|\\d{10}+))|\\d{5}([- ]*)\\d{6}", Pattern.CASE_INSENSITIVE).matcher(stringPhoneNumber).find();
		return bool;
	}
	
	public void callerMethod() {
		//Employee employee = new Employee();
		//EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		//int k=employeeDAOImpl.addEmployee(employee);
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		System.out.println(isInteger(string));
		in.close();
	}
}
