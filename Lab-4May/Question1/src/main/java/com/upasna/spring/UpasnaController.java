package com.upasna.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpasnaController { // main class
@RequestMapping("/hello")
public String display() { //method
	return "index";
}
}
