package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/hello")
	public String displayMsg(Model model) {
		model.addAttribute("msg", "Msg from the controller");
		return "index";
	}
}
