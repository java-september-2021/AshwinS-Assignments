package com.codingdojo.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class HomeController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public String index(Model viewModel, @ModelAttribute("language") Language language) {
		viewModel.addAttribute("allLanguages", this.lService.getAllLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/new")
	public String addNew(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/languages";
	}
	
	@GetMapping("/{id}/edit")
	public String editRecord(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("language") Language language) {
		viewModel.addAttribute("language", this.lService.getOneLangauge(id));
		return "edit.jsp";
	}
	
	@PostMapping("/{id}/edit")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.getOneLangauge(id));
			return "edit.jsp";
		}
		this.lService.editLanguage(language);
		return "redirect:/languages";
	}
	
	@GetMapping("/{id}")
	public String viewRecord(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("language") Language language) {
		viewModel.addAttribute("language", this.lService.getOneLangauge(id));
		return "view.jsp";
	}
//	@DeleteMapping("/{id}/destroy")
	@RequestMapping(value="/{id}/destroy", method=RequestMethod.POST)
    public String destroy(@PathVariable("id") Long id) {
        this.lService.deleteLangauge(id);
        return "redirect:/languages";
    }
	
}
