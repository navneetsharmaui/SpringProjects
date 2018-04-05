/**
 * 
 */
package com.mindtree.springfive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author M1044357
 *
 */
@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping("/main")
	public String pageGenerate() {
		String content ="<html>"
				+ "" + "<head><title>MVC Web</title></head>"
				+ "" + "<body>This is Spring MVC Web!</body>"
				+ "" + "</html>"
				+"";
		
		return content;
	}
	
	@RequestMapping("/intro")
	public String introPage() {
		return "intro";
	}
	
	@RequestMapping("/welcome")
	public String welcomePage() {
		return "welcome";
	}
}
