package com.superdan.taskmanager.repository;

import com.superdan.taskmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Same: no extra code needed for basic CRUD
}
