package com.sopra.mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Person 
{
	@RequestMapping("/nithu")
	public String nithu()
	{
		return "person";
	}
	
	

}
