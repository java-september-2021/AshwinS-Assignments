package com.ashwin.ninjaAndDojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.ninjaAndDojo.models.Dojo;



@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll(); //select * from languages
	
}