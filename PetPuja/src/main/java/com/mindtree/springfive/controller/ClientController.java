/**
 * 
 */
package com.mindtree.springfive.controller;

import java.util.LinkedHashSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.springfive.dao.DaoImplementation;
import com.mindtree.springfive.entity.OrderDetails;

/**
 * @author M1044357
 *
 */
@Controller
public class ClientController {
	@Autowired
	DaoImplementation dao;

	@RequestMapping("/")
	public String addOrder() {
		return "index";
	}

	@RequestMapping("/addorderdata")
	public ModelAndView adddata(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		String pin = request.getParameter("postalcode");
		String ordertype = request.getParameter("selectoption");
		System.out.println(username+" "+address+" "+email+" "+phonenumber+" "+pin+" "+ordertype);
		OrderDetails orderDetails = new OrderDetails(username, address, phonenumber, pin, email, ordertype);
		if (dao.addToDatabase(orderDetails)) {
			int loid=dao.findLatestOrderID();
			System.out.println(loid);
			return new ModelAndView("orderdetails", "loid", loid);
		} else
			return new ModelAndView("wrong");
	}
	
	@RequestMapping("/orderdetails")
	public String addOrderDetails() {
		return "orderdetails";
	}

	@RequestMapping("/cancelorder")
	public ModelAndView cancelorderData(HttpServletRequest request, HttpServletResponse response) {
		int oid = Integer.parseInt(request.getParameter("oid"));
		System.out.println(oid);
		if (dao.deleteOrder(oid))
			return new ModelAndView("orderdetails");
		else
			return new ModelAndView("wrong");
	}

	@RequestMapping("/getorderlist")
	public ModelAndView getOrderList(HttpServletRequest request, HttpServletResponse response) {
		String emailID = request.getParameter("email");
		if (dao.findOrderListByEmailID(emailID) != null) {
			LinkedHashSet<OrderDetails> lists = dao.findOrderListByEmailID(emailID);
			return new ModelAndView("orderdetails", "lists", lists); 
		} else {
			return new ModelAndView("wrong");
		}
	}
}