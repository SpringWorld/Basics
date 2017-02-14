package org.booking.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	/*
	 * the return string will invoke the html/web file matching with the name 
	 */
	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
