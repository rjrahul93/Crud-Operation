package com.nimap.crud.repository;

import com.nimap.crud.model.Category;
import javax.persistence.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	List<Category> findAll();

	Object findById(Long id);

	Category save(Category category);

	void deleteById(Long id);

	
}