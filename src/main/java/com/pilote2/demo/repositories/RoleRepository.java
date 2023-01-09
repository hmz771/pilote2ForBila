package com.pilote2.demo.repositories;

import com.pilote2.demo.entities.Identity.Role;
import com.pilote2.demo.entities.Identity.User;
import com.pilote2.demo.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    List<Role> findByNameContaining(@Param("name") String name);
    Optional<Role> findByName(ERole name);
   // Optional<Role> findByName(String name);

}
