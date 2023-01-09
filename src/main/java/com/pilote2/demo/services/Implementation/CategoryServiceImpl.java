package com.pilote2.demo.services.Implementation;

import com.pilote2.demo.dtos.CategoryDto;
import com.pilote2.demo.entities.Category;
import com.pilote2.demo.mappers.CategoryMapperImpl;
import com.pilote2.demo.repositories.CategoryRepository;
import com.pilote2.demo.services.CategoryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    private CategoryMapperImpl dtoMapper;
    @Override
    public Category save(CategoryDto categoryDto) {
            log.info("saving a new category");
        return categoryRepository.save(CategoryDto.toEntity(categoryDto));

       //Category saveCategory= categoryRepository.save(CategoryDto.toEntity(categoryDto));
      // return saveCategory;
    }

    @Override
    public List<CategoryDto> listCategories() {
        List<Category> categories=categoryRepository.findAll();
        List<CategoryDto> categoriesDto=categories.stream().map(cat->dtoMapper.fromCategory(cat)).collect(Collectors.toList());
        return categoriesDto;
    }
    @Override
    public void update(CategoryDto categoryDto) {
        categoryRepository.save(CategoryDto.toEntity(categoryDto));
        //Category saveCategory=
        // categoryRepository .delete(categoryRepository.findById(id));


    }
    @Override
    public void delete(long id) {
        Optional<Category> cat=categoryRepository.findById(id);
       // categoryRepository .delete(categoryRepository.findById(id));


    }
}
