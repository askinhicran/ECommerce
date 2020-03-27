package com.company.ecommerce.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.ecommerce.entity.Product;
@CrossOrigin("http://localhost:4200") // bu url den gelen cagrıları kabul ediyorum,yasaga sokma diyorum
public interface ProductRepositoy extends JpaRepository<Product,Long>{
	
	   Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable); //url de search olacak



}
