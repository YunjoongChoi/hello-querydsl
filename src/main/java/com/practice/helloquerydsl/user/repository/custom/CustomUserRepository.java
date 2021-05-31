package com.practice.helloquerydsl.user.repository.custom;

import com.practice.helloquerydsl.user.dto.UserDto;
import com.practice.helloquerydsl.user.entity.User;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;
import java.util.List;

public interface CustomUserRepository {
    List<User> getUsersDynamically(User param, Pageable pageable, LocalDateTime from, LocalDateTime to);
}
