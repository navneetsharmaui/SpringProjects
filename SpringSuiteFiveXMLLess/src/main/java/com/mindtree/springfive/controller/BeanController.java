/**
 * 
 */
package com.mindtree.springfive.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.springfive.model.DataService;
import com.mindtree.springfive.model.Department;
import com.mindtree.springfive.model.Employee;
import com.mindtree.springfive.model.ListEmployees;

/**
 * @author M1044357
 *
 */
@Controller
public class BeanController {
	
	@Autowired
	@Qualifier(value="empRec1")
	private Employee empRecs;
	
	@Inject
	@Named(value="dept1")
	private Department deptRecs;
	
	@Resource(name="listEmployees")
	private ListEmployees listEmps;
	
	@Autowired
	private DataService dataService;
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/list_emps")
	public String showEmployee(ModelMap model){
		empRecs.setFirstName("Navneet");
		empRecs.setLastName("Sharma");
		empRecs.setBirthDate(new Date(2018, 8, 15));
		empRecs.setAge(23);
		empRecs.setSalary(325000.00);
		empRecs.setPosition("FSE");
		deptRecs.setDeptNo(1);
		deptRecs.setDeptName("Java FSE");
		empRecs.setDepartment(deptRecs);
		model.addAttribute("firstName", empRecs.getFirstName());
		model.addAttribute("title", dataService.getTitle());
		return "list-employees";
	}
	
	@RequestMapping("/show_dept")
	public String showDepartment(Model model){
		model.addAttribute("deptNo", deptRecs.getDeptNo());
		return "show-dept";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/view_emps")
	public String viewEmps(Model model){
		empRecs.setFirstName("Navneet");
		empRecs.setLastName("Sharma");
		empRecs.setBirthDate(new Date(2018, 8, 15));
		empRecs.setAge(23);
		empRecs.setSalary(325000.00);
		empRecs.setPosition("FSE");
		deptRecs.setDeptNo(1);
		deptRecs.setDeptName("Java FSE");
		empRecs.setDepartment(deptRecs);
		model.addAttribute("empList", listEmps.getListEmps());
		model.addAttribute("title", dataService.getTitle());
		return "view-emps";
	}
}