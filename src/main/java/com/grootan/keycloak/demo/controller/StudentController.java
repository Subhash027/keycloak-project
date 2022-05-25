package com.grootan.keycloak.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

	@GetMapping("/welcome")
	public String  login()
	{
		return "welcome";
	}

	@GetMapping("/home")
	public String  home()
	{
		return "home";
	}

	@GetMapping("/manage-students")
	@PreAuthorize("hasAuthority('PROFESSOR')")
	public ModelAndView manageStudents()
	{
		ModelAndView modelAndView = new ModelAndView("manage-students");
		return modelAndView;
	}

	@GetMapping("/access-denied")
	public ModelAndView accessDenied()
	{
		ModelAndView modelAndView = new ModelAndView("access-denied");
		return modelAndView;
	}

	@GetMapping("/logout")
	public String logout1(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/welcome";
	}
}