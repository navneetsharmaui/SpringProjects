/**
 * 
 */
package com.mindtree.springfive.context;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.mindtree.springfive.model.Department;
import com.mindtree.springfive.model.Employee;

/**
 * @author M1044357
 *
 */
@Configuration
public class BeanConfig {
	
	@Bean(name="empRec1")
	@Scope("singleton")
	public Employee getEmpRecord1() {
		Employee empRec1 = new Employee();
		return empRec1;
	}
	
	@Bean(name="dept1")
	public Department getDept1() {
		Department dept1 = new Department();
		return dept1;
	}
	
	@SuppressWarnings("deprecation")
	@Bean(name="empRec2")
	@Scope("prototype")
	public Employee getEmpRecord2() {
		Employee empRec2 = new Employee();
		empRec2.setFirstName("Navneet");
		empRec2.setLastName("Sharma");
		empRec2.setBirthDate(new Date(2018, 8, 15));
		empRec2.setAge(23);
		empRec2.setSalary(325000.00);
		empRec2.setPosition("FSE");
		empRec2.setDepartment(getDept2());
		return empRec2;
	}
	
	@Bean(name="dept2")
	public Department getDept2() {
		Department dept2 = new Department();
		dept2.setDeptNo(13456);
		dept2.setDeptName("Java FSE");
		return dept2;
	}
	
	@Bean(name="empRec3")
	public Employee getEmpRecord3(){
		@SuppressWarnings("deprecation")
		Employee empRec3 = new Employee("Jose","Rizal",new Date(50, 5, 19), 101, 90000.00, "scriber", getDept3());
		return empRec3;
	}
	
	@Bean(name="dept3")
	public Department getDept3(){
		Department dept3 = new Department(56748, "Communication Department");
		return dept3;
	}
	
	@SuppressWarnings("deprecation")
	@Lazy
	@Bean(name="empRec4")
	public Employee getEmpRecord4() {
		Employee empRec4 = new Employee("Diego","Silang",new Date(65, 11, 15), 55, 85000.00, "guitarist", getDept4());
		return empRec4;
	}
	
	@Lazy
	@Bean(name="dept4")
	public Department getDept4() {
		Department dept4 = new Department(11223, "Music Department");
		return dept4;
	}

}
