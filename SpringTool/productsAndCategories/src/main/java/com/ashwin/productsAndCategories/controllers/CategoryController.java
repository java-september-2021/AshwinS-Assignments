package com.ashwin.productsAndCategories.controllers;

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
@RequestMapping("categories")
public class CategoryController {
		@Autowired
		private CategoryService cService;
		@Autowired
		private ProductService pService;

		
		@GetMapping("/new")
		public String index(Model viewModel, @ModelAttribute("category") Category category) {
			viewModel.addAttribute("allCategories", this.cService.getAllCategories());
			return "categoryCreate.jsp";
		}
		
		@PostMapping("/new")
		public String createProduct(Model viewModel, @ModelAttribute("category") Category category, BindingResult result) {
			if(result.hasErrors()) {
				return "categoryCreate.jsp";
			}
			this.cService.createCategory(category);
			return "redirect:/categories/new";
		}
		
		@GetMapping("/{id}")
		public String showCategory(@PathVariable("id") Long id,  Model viewModel, @ModelAttribute("category") Category category) {
			viewModel.addAttribute("category", cService.getOneCategory(id));
			viewModel.addAttribute("products", pService.getCategorybyProduct(cService.getOneCategory(id)));
			return "categoryView.jsp";
		}
		
		@PostMapping("/{id}")
		public String addCatToProd(@PathVariable("id") Long id, @RequestParam("products") Long prodId, Model viewModel, @ModelAttribute("category") Product product) {
			Category catToAdd = this.cService.getOneCategory(id);
			Product addedProduct = this.pService.getOneProduct(prodId);
			cService.AddProductToCategory(addedProduct, catToAdd);
			return "redirect:/categories/{id}";
		}
}
