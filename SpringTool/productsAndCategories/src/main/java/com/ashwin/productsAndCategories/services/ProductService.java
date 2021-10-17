package com.ashwin.productsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.productsAndCategories.models.Category;
import com.ashwin.productsAndCategories.models.Product;
import com.ashwin.productsAndCategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	public List<Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	
	//Get one Product
	public Product getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//Create Product
	public Product createProduct(Product dojo) {
		return this.pRepo.save(dojo);
	}
	
	//Update Product
	public Product editProduct(Product dojo) {
		return this.pRepo.save(dojo);
	}
	
	//Delete Product
	public String deleteProduct(Long id) {
		this.pRepo.deleteById(id);
		return "Product has been deleted.";
	}
	
	public void AddCategoryToProduct(Product product, Category category) {
		List <Category> CategoriesAssociated = product.getCategories();
		CategoriesAssociated.add(category);
		this.pRepo.save(product);
	}
	
	public List<Product> getCategorybyProduct(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
}