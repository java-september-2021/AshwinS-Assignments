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

import com.ashwin.ninjaAndDojo.models.Ninja;
import com.ashwin.ninjaAndDojo.services.DojoService;
import com.ashwin.ninjaAndDojo.services.NinjaService;

@Controller
@RequestMapping("ninjas")
public class NinjaController {
	@Autowired
	private DojoService dService;
	@Autowired 
	private NinjaService nService;	
	
	
	@GetMapping("/new")
	public String newNinja(Model viewModel, @ModelAttribute("ninja") Ninja ninja) {
		viewModel.addAttribute("allDojos", this.dService.getAllDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/new")
	public String addNew(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		}
		this.nService.createNinja(ninja);
		return "redirect:/ninjas/new";
	}
	
	@GetMapping("/view")
	public String viewNinjas(Model viewModel) {
		viewModel.addAttribute("allNinjas", this.nService.getAllNinjas());
		return "view.jsp";
	}
	
}
