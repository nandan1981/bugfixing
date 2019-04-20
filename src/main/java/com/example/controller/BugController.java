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
	
	@RequestMapping(value="/")
	public String welcomeDefaultController() {
		return "Welcome! to the desert";
	}
		
	@RequestMapping(value="/welcome")
	public String welcomeController() {
		return "index";
	}

	@RequestMapping(value="/registeredWelcome")
	public String welcomeRegisteredUserController() {
		
		return "userIndex";
	}
	
	@RequestMapping(value="/adminWelcome")
	public String welcomeAdminController() {
		return "adminIndex";
	}
}
