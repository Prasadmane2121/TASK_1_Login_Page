package com.org.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.model.Student;
import com.org.servicei.serviceinterface;


@Controller
public class Homecontroller {

	@Autowired
	serviceinterface ssi;
	
	@GetMapping("/")
	public  String prelogin() { 
		return "index";
	}
	@GetMapping("/back")
	public String backTologin() {
		return "index";
	}
	@GetMapping("/log")
	public String loginstudent(@RequestParam String username, @RequestParam String password,Model m){
		List<Student> list=ssi.loginstudent(username,password);
		if(!list.isEmpty()) {
			m.addAttribute("data",list);
			return "success";
		}
		else {
			m.addAttribute("error", "Incorrect username or password");
			return "index";
		}
	}
}
