package com.springshop.springshop.product;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private final List<Product> products = List.of(
			new Product(1, "Camiseta Spring", "Camiseta de algodón para fans de Spring.", new BigDecimal("19.90")),
			new Product(2, "Taza Java", "Taza de cerámica para tus pausas de café.", new BigDecimal("12.50")),
			new Product(3, "Mochila Developer", "Mochila cómoda para llevar tu equipo.", new BigDecimal("39.00")));

	public List<Product> findAll() {
		return products;
	}
}
