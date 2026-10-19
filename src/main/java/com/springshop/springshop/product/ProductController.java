package com.springshop.springshop.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping({ "/", "/productos" })
	public String list(Model model) {
		model.addAttribute("products", productService.findAll());
		return "productos/lista";
	}
}
