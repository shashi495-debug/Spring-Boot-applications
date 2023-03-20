package com.example.demo.controller1;
import com.example.demo.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class index {
@GetMapping("/if")
	String regis()
	{
		return "welcome";
		
	}
}
