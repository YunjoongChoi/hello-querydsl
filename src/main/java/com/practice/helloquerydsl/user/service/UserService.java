package com.practice.helloquerydsl.user.service;

import com.practice.helloquerydsl.user.dto.UserDto;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<UserDto>> getUsers(UserDto param, Pageable pageable);
    ResponseEntity<UserDto> getUser(UserDto param);
}
