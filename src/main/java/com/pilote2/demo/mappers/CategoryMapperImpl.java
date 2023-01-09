package com.pilote2.demo.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.pilote2.demo.dtos.CategoryDto;
import com.pilote2.demo.entities.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapperImpl {

    public CategoryDto fromCategory(Category category)
    {
        CategoryDto categoryDto=new CategoryDto();
        BeanUtils.copyProperties(category,categoryDto);
        return categoryDto;

    }
    public Category fromCategoryDto(CategoryDto categoryDto)
    {

        Category category=new Category();
        BeanUtils.copyProperties(categoryDto,category);
        return category;

    }




}
