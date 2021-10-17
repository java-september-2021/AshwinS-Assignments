package com.ashwin.productsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.productsAndCategories.models.Category;
import com.ashwin.productsAndCategories.models.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll(); //select * from languages
	
//	// Retrieves a list of all products for a 
    List<Product> findAllByCategories(Category category);
//    
//    // Retrieves a list of any products a particular product
//    // does not belong to.
    List<Product> findByCategoriesNotContains(Category category);

}