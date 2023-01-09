package com.pilote2.demo.web;

import com.pilote2.demo.dtos.CategoryDto;
import com.pilote2.demo.entities.Category;
import com.pilote2.demo.entities.Identity.User;
import com.pilote2.demo.repositories.CategoryRepository;
import com.pilote2.demo.services.CategoryService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@AllArgsConstructor

@Slf4j
public class CategoryController {

    private CategoryService categoryService;
//@WithMock
    @GetMapping("/categories")
    public List<CategoryDto> categories()
    {

        return categoryService.listCategories();

    }

//    @PostMapping(value = {"", "/"})
//    public ResponseEntity<?> create(@Valid @RequestBody User user)
//    {
////        log.debug("Accediendo a create() con User = {}", user.toString());
////        if(  this.loadUser( user.getUserName() ) != null)
////        {
////            return ResponseEntity.status(HttpStatus.CONFLICT).build();
////        }
////        user.hashPassword();
////
////        userRepository.save(user);
////        return ResponseEntity.ok().body(user);
//
//    }
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/categoriesz")
    public ResponseEntity<Category> save(@Valid @RequestBody CategoryDto cat)
    {
//        Category updated =  categoryService.save(cat);
//        return ResponseEntity.status(HttpStatus.CREATED).body(updated);


        try {
            Category _tutorial = categoryService.save(cat);
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PostMapping("/categories/cat")
    public void update(@Valid @RequestBody CategoryDto cat)
    {

        categoryService.update(cat);

    }
    @DeleteMapping
    public void delete(Long id)
    {
        categoryService.delete(id);
    }




}
