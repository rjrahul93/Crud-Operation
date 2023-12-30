package com.nimap.crud.service;

import com.nimap.crud.model.Product;

import java.awt.print.Pageable;
import java.util.List;

public interface ProductService {
	
	Page<Product> getAllProducts(Pageable pageable);
//    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product saveProduct(Product product);

    void deleteProduct(Long id);

	List<Product> getAllProducts();
}