/**
 * 
 */
package com.mindtree.springfive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author M1044357
 *
 */
@Controller
@RequestMapping("/simplecontroller")
public class SimpleTestController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String viewTransactions(){
		return "simple_list";
	}
}