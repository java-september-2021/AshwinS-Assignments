package com.ashwin.ninjaAndDojo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ashwin.ninjaAndDojo.models.Ninja;
import com.ashwin.ninjaAndDojo.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository nRepo;
	
	// @Autowired does exactly what the below code does....
	//	public LanguageService(LanguageRepository repository) {
	//		this.lRepo = repository;
	//	}
	
	
// Get every single language and return in ArrayList
	
	public List<Ninja> getAllNinjas(){
		return this.nRepo.findAll();
	}
	
	//Get one Ninja
	public Ninja getOneNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	//Create Ninja
	public Ninja createNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//Update Ninja
	public Ninja editNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//Delete Ninja
	public String deleteNinja(Long id) {
		this.nRepo.deleteById(id);
		return "Ninja has been deleted.";
	}
}
