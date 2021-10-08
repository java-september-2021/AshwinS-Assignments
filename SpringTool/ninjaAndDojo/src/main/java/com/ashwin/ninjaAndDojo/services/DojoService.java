package com.ashwin.ninjaAndDojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.ninjaAndDojo.models.Dojo;
import com.ashwin.ninjaAndDojo.repositories.DojoRepository;




@Service
public class DojoService {
	@Autowired
	private DojoRepository dRepo;
	
	// @Autowired does exactly what the below code does....
	//	public LanguageService(LanguageRepository repository) {
	//		this.lRepo = repository;
	//	}
	
	
// Get every single language and return in ArrayList
	
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	
	//Get one Dojo
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	//Create Dojo
	public Dojo createDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//Update Dojo
	public Dojo editDojo(Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//Delete Dojo
	public String deleteDojo(Long id) {
		this.dRepo.deleteById(id);
		return "Dojo has been deleted.";
	}
}