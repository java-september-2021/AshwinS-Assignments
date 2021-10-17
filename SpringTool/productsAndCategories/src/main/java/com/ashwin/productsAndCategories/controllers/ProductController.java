package com.ashwin.productsAndCategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashwin.productsAndCategories.models.Category;
import com.ashwin.productsAndCategories.models.Product;
import com.ashwin.productsAndCategories.services.CategoryService;
import com.ashwin.productsAndCategories.services.ProductService;

@Controller
@RequestMapping("products")
public class ProductController {
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;

	
	@GetMapping("/new")
	public String index(Model viewModel, @ModelAttribute("product") Product product) {
		viewModel.addAttribute("allProducts", this.pService.getAllProducts());
		return "productCreate.jsp";
	}
	
	@PostMapping("/new")
	public String createProduct(Model viewModel, @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		this.pService.createProduct(product);
		return "redirect:/products/new";
	}
	
	@GetMapping("/{id}")
	public String showProduct(@PathVariable("id") Long id,  Model viewModel, @ModelAttribute("product") Product product) {
		viewModel.addAttribute("product", pService.getOneProduct(id));
		viewModel.addAttribute("categories", cService.getCategorybyProduct(pService.getOneProduct(id)));
		return "productView.jsp";
	}
	
	@PostMapping("/{id}")
	public String addCatToProd(@PathVariable("id") Long id, @RequestParam("categories") Long catId, Model viewModel, @ModelAttribute("product") Product product) {
		Category addedCat = this.cService.getOneCategory(catId);
		Product productToAdd = this.pService.getOneProduct(id);
		pService.AddCategoryToProduct(productToAdd, addedCat);
		return "redirect:/products/{id}";
	}
	
	
}