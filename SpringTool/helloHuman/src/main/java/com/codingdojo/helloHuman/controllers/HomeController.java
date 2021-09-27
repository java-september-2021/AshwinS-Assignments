package com.codingdojo.helloHuman.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery, Model model) {
        if( searchQuery == null) {
        	return "Hello Human";
        }
        else {
    		return "Hello " + searchQuery;
        }
    }
}
