package com.devsuperior.demo.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Product;
import com.devsuperior.demo.repositories.ProductRepository;


@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getObjects() {
		/*Departament d1 = new Departament(1L, "Tech");
		Departament d2 = new Departament(2L, "Pet");
		
		Product p1 = new Product(1L, "Macbook Pro", 4000.0, d1);
		Product p2 = new Product(3L, "PC Gamer", 5000.0, d1);
		Product p3 = new Product(4L, "Pet House", 300.0, d2);  */
		
				List<Product> list = productRepository.findAll();
		return list;
	}

}
