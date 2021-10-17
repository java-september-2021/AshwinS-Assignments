package com.ashwin.productsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.productsAndCategories.models.Category;
import com.ashwin.productsAndCategories.models.Product;
import com.ashwin.productsAndCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	public List<Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	
	//Get one Category
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	//Create Category
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//Update Category
	public Category editCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//Delete Category
	public String deleteCategory(Long id) {
		this.cRepo.deleteById(id);
		return "Category has been deleted.";
	}
	
	//Get Categories by product
	public List<Category> getCategorybyProduct(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public void AddProductToCategory(Product product, Category category) {
		List <Product> ProductsAssociated = category.getProducts();
		ProductsAssociated.add(product);
		this.cRepo.save(category);
	}
}
