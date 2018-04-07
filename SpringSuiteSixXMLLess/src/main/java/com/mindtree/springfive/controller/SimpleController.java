/**
 * 
 */
package com.mindtree.springfive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author M1044357
 *
 */
@Controller
@RequestMapping("/simple")
public class SimpleController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String processGetReq(Model model) {
		String transcationType = "Simple GET Transaction";
		model.addAttribute("transcationType", transcationType);
		return "get";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processPostReq(Model model) {
		String transcationType = "Simple POST Transaction";
		model.addAttribute("transcationType", transcationType);
		return "post";
	}

}
