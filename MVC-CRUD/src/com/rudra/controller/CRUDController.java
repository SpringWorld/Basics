package com.rudra.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CRUDController extends MultiActionController{
	private String name;
	private String email;
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ModelAndView empsave(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Map msg =  new HashMap();
		msg.put("name","Hello "+name);
		msg.put("email","email : "+email);
		return new ModelAndView("success",msg);
	}
	public ModelAndView empupdate(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Map msg =  new HashMap();
		msg.put("name","Hello "+name);
		msg.put("email","email : "+email);
		return new ModelAndView("success",msg);
	}
}
