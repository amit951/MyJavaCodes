package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {

	
	@RequestMapping("/home")
	public String home(Model model)
	{	
		
		model.addAttribute("name","AMit");
		model.addAttribute("ID",435345);
		System.out.println("This is home request mapping");
		List<String> al=new ArrayList<String>();
		al.add("Tiffin");
		al.add("waterbottle");
		al.add("Handkerchief");
		model.addAttribute("AL",al);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		
		System.out.println("This is about request mapping ");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help controller");
		
		//created a object of the class
		ModelAndView modelandview =new ModelAndView();
		
		//added object
		modelandview.addObject("name","Amitt");
		modelandview.addObject("id",234234);
		LocalDateTime now=LocalDateTime.now();
		modelandview.addObject("time",now);
		
		//setting page
		modelandview.setViewName("help");
		
		return modelandview;
	}
	
	
}
