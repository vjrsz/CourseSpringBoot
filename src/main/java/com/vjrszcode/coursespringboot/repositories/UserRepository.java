package com.vjrszcode.coursespringboot.repositories;

import com.vjrszcode.coursespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
