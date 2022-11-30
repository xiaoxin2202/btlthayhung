package com.example.Website.repository;

import com.example.Website.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findById(long x);
    User findByName(String x);

}
