package com.pilote2.demo.repositories;

import com.pilote2.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {



}
