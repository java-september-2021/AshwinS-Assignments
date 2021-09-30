package com.codingdojo.displayDate.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private Date getDate() {
		Date now = new Date();
		return now;
	}
	
	@GetMapping("/")
	public String displayDashboard() {
		return "index.jsp";
	}
	
	@GetMapping("/time")
	public String displayCurrentTime(Model model) {
		model.addAttribute("date", getDate());
		return "time.jsp";
	}
	
	@GetMapping("/date")
	public String displayCurrentDate(Model model) {
		model.addAttribute("date", getDate());
		return "date.jsp";
	}
}	
