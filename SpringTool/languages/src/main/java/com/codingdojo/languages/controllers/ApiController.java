package com.codingdojo.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/")
	public List<Language> index() {
		return this.lService.getAllLanguages();
	}
	
	@GetMapping("/{id}")
	public Language getOne(@PathVariable("id") Long id) {
		return this.lService.getOneLangauge(id);
	}
	
	@PostMapping("/")
	public Language create(Language language) {
		return this.lService.createLanguage(language);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") Long id) {
		return this.lService.deleteLangauge(id);
	}
}
