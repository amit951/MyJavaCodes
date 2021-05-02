package com.Rest_first.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {

	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		return "This is what we have now";
	}
}
