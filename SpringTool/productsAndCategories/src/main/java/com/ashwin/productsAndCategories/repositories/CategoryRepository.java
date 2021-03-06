package com.ashwin.productsAndCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.productsAndCategories.models.Category;
import com.ashwin.productsAndCategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
		List<Category> findAll(); //select * from languages
		
//		// Retrieves a list of all categories for a 
	    List<Category> findAllByProducts(Product product);
	//    
//	    // Retrieves a list of any categories a particular product
//	    // does not belong to.
	    List<Category> findByProductsNotContains(Product product);
}
