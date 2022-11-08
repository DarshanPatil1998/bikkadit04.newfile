package com.example.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

	@GetMapping
	public String Msg(Model model) {
		
		String msg = "welcome to bikkadit";
		model.addAttribute("WELCOME",msg);
		return "welcome";
		
		
	}
}
