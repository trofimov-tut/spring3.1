package com.trofimov.spring3.spring31.repository;

import com.trofimov.spring3.spring31.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
