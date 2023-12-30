package com.nimap.crud.repository;

import com.nimap.crud.model.Product;
import javax.persistence.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAll();

	Object findById(Long id);

	Product save(Product product);

	void deleteById(Long id);
}