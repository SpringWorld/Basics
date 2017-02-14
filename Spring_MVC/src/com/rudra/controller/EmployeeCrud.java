package com.rudra.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class EmployeeCrud implements Controller {

	protected ModelAndView empsave(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		System.out.println("Employee Details saved");
		
		System.out.println("Name  "+name);
		System.out.println("email  "+email);
		System.out.println("address  "+address);
		Map msg =  new HashMap();
		msg.put("message","Hello "+name+" .. using ParameterizableViewController with ControllerClassNameHandler mapping  ");
		return new ModelAndView("success",msg);
	}
	protected ModelAndView empupdate(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		System.out.println("Employee Details updated");
		
		System.out.println("Name  "+name);
		System.out.println("email  "+email);
		System.out.println("address  "+address);
		return null;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		Map msg =  new HashMap();
		msg.put("message","Hello  .. using ParameterizableViewController with ControllerClassNameHandler mapping  ");
		return new ModelAndView("success",msg);
	}
}
