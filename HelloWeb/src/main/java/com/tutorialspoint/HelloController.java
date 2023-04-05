package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
    ModelAndView model = new ModelAndView("hello");
	model.addObject("msg", "Hello world");
	return model;
   }
}
