package com.sopra.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Org 
{
	
	@RequestMapping("/about")
	public String about()
	{
		return "org";
	}
}
