package com.codingdojo.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;
	
	// @Autowired does exactly what the below code does....
	//	public LanguageService(LanguageRepository repository) {
	//		this.lRepo = repository;
	//	}
	
	
// Get every single language and return in ArrayList
	
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	//Get one album
	public Language getOneLangauge(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Create Language
	public Language createLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	//Update Language
	public Language editLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	//Delete Language
	public String deleteLangauge(Long id) {
		this.lRepo.deleteById(id);
		return "Language has been deleted.";
	}
}
