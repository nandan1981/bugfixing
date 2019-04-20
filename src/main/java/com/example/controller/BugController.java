/**
 * 
 */
package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nandan
 *
 */
@Controller
public class BugController {
	
	private String index = "index";
	
	@RequestMapping(value="/welcome")
	public String welcomeController() {
		
System.out.println("in welcome");
		return "index";
	}

}
