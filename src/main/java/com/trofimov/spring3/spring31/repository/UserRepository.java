package com.trofimov.spring3.spring31.repository;

import com.trofimov.spring3.spring31.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
