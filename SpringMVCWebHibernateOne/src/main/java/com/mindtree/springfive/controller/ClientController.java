/**
 * 
 */
package com.mindtree.springfive.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.springfive.dao.DaoImplementation;
import com.mindtree.springfive.entity.ProjectDetails;
import com.mindtree.springfive.entity.UserDetails;

/**
 * @author M1044357
 *
 */
@Controller
public class ClientController {
	@Autowired
	DaoImplementation dao;

	@RequestMapping("/login")
	public ModelAndView checkData(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");

		String password = request.getParameter("password");
		if (username.equals("admin") && password.equals("root"))
			return new ModelAndView("homepage");
		else
			return new ModelAndView("InvalidUser");

	}

	@RequestMapping("/adduser")
	public String addUser() {
		return "adduser";
	}

	@RequestMapping("/adduserdata")
	public ModelAndView adddata(HttpServletRequest request, HttpServletResponse response) {
		String userid = request.getParameter("userid");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("emailid");
		String doj = request.getParameter("doj");
		String role = request.getParameter("role");
		String project = request.getParameter("project");
		UserDetails user = new UserDetails(userid, username, password, doj, email, role, project);
		if (dao.addToDatabase(user))
			return new ModelAndView("successful");
		else
			return new ModelAndView("wrong");
	}

	@RequestMapping("/addproject")
	public String addProject() {
		return "addproject";
	}

	@RequestMapping("/addprojectdata")
	public ModelAndView addproject(HttpServletRequest request, HttpServletResponse response) {
		int projectId=Integer.parseInt(request.getParameter("projectid"));
		String projectName=request.getParameter("projectname");
		String projectDescription=request.getParameter("projectdescription");
		int estimatedHours=Integer.parseInt(request.getParameter("estimatedhours"));
		ProjectDetails project= new ProjectDetails(projectId, projectName, projectDescription, estimatedHours);
		if(dao.addProjectToDatabase(project))
			return new ModelAndView("successful");
		else
			return new ModelAndView("wrong");
}
@RequestMapping("/viewprojects")
public String viewProject()
{
	return "wrong";
	}



}