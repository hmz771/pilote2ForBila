package com.pilote2.demo.services;

import com.pilote2.demo.dtos.CategoryDto;
import com.pilote2.demo.entities.Category;

import java.util.List;

public interface CategoryService {

    Category save (CategoryDto category);
    void update (CategoryDto category);
    List<CategoryDto> listCategories();
    void delete(long id);




}
