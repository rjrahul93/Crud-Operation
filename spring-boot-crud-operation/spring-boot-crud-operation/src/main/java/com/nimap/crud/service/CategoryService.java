package com.nimap.crud.service;


import com.nimap.crud.model.Category;
import javax.persistence.*;

import java.awt.print.Pageable;
import java.util.List;

public interface CategoryService {
	Page getAllCategories(Pageable pageable);
//    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    Category saveCategory(Category category);

    void deleteCategory(Long id);

	List<Category> getAllCategories();
}