package com.company.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.ecommerce.service.ProductServiceImpl;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

	@Autowired
	ProductServiceImpl service;

}
