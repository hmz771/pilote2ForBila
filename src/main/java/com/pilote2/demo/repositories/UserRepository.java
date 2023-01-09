package com.pilote2.demo.repositories;

import com.pilote2.demo.entities.Category;
import com.pilote2.demo.entities.Identity.Role;
import com.pilote2.demo.entities.Identity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByuserNameIgnoreCase(String identifier);
    //User findById(Long id);

    List<User> findByuserNameContaining(@Param("username") String username);
    Boolean existsByuserName(String username);

    Boolean existsByemail(String email);
  // User findByuserNameIgnoreCase(String username);
}
