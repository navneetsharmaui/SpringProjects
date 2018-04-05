/**
 * 
 */
package com.mindtree.springfive.controller;

import javax.annotation.Resource;
import javax.inject.Inject;

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
	@Qualifier(value="empRec2")
	private Employee empRecs;
	
	
	@Inject
	private Department dept2;
	
	@Resource(name="listEmployees")
	private ListEmployees listEmps;
	
	@Autowired
	private DataService dataService;
	
	@RequestMapping("/list_emps")
	public String showEmployee(ModelMap model){
		model.addAttribute("firstName", empRecs.getFirstName());
		model.addAttribute("title", dataService.getTitle());
		return "list-employees";
	}
	
	@RequestMapping("/show_dept")
	public String showDepartment(Model model){
		model.addAttribute("deptNo", dept2.getDeptNo());
		return "show-dept";
	}
	
	@RequestMapping("/view_emps")
	public String viewEmps(Model model){
		model.addAttribute("empList", listEmps.getListEmps());
		return "view-emps";
	}
}
