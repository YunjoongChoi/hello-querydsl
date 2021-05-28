package com.practice.helloquerydsl.user.repository;

import com.practice.helloquerydsl.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
