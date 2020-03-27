package com.company.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.company.ecommerce.entity.ProductCategory;
@CrossOrigin("http://localhost:4200") // bu url den gelen cagrıları kabul ediyorum,yasaga sokma diyorum
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
