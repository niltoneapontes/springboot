package com.nilton.primeiroprojeto.userdpt.repositories;

import com.nilton.primeiroprojeto.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
