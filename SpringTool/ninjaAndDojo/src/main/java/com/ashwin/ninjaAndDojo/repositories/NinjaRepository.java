package com.ashwin.ninjaAndDojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.ninjaAndDojo.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	List<Ninja> findAll(); //select * from languages
	
}
