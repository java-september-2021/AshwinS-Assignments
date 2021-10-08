package com.ashwin.ninjaAndDojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashwin.ninjaAndDojo.models.Dojo;
import com.ashwin.ninjaAndDojo.models.Ninja;
import com.ashwin.ninjaAndDojo.services.DojoService;
import com.ashwin.ninjaAndDojo.services.NinjaService;



@Controller
@RequestMapping("dojos")
public class HomeController {
	@Autowired
	private DojoService dService;

	
	@GetMapping("/new")
	public String index(Model viewModel, @ModelAttribute("dojo") Dojo dojo) {
		viewModel.addAttribute("allDojos", this.dService.getAllDojos());
		return "index.jsp";
	}
	
	@PostMapping("/new")
	public String addNew(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.dService.createDojo(dojo);
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/{id}")
	public String viewDojo(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("thisDojo", this.dService.getOneDojo(id));
		return "show.jsp";
	}
	

}
