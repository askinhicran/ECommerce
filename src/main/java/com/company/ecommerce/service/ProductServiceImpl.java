package com.company.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.ecommerce.entity.Product;
import com.company.ecommerce.entity.ProductCategory;
import com.company.ecommerce.repository.ProductRepositoy;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepositoy repo;

	@Override
	public List<Product> findAll() {
		List<Product> productList = repo.findAll();
		return productList;
	}

}
