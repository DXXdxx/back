package com.hbue.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author dxx
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@RequestMapping("/admin")
	public String login() {
		return "index";
	}
}
