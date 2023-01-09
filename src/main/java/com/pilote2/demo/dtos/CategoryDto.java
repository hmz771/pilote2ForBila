package com.pilote2.demo.dtos;

import com.pilote2.demo.entities.Category;
import com.pilote2.demo.enums.CategoryStatus;
import lombok.Data;

import javax.persistence.*;
@Data
public class CategoryDto {


    private Long categoryid;
    private String name;
    private String description;
    private CategoryStatus status;
    public static Category toEntity(CategoryDto articleDto){

        if(articleDto == null){

            return null;
        }

        Category category = new Category();
        category.setId(articleDto.getCategoryid());
        category.setName(articleDto.getName());
        category.setDescription(articleDto.getDescription());


        return category;
    }
}
