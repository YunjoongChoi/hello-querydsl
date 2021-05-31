package com.practice.helloquerydsl.user.service;

import com.practice.helloquerydsl.user.dto.UserDto;
import com.practice.helloquerydsl.user.mapper.UserMapper;
import com.practice.helloquerydsl.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public ResponseEntity<List<UserDto>> getUsers(UserDto param, Pageable pageable) {
        List<UserDto> users = userMapper.toDto(userRepository.getUsersDynamically(userMapper.toEntity(param), pageable, param.getFrom(), param.getTo()));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserDto> getUser(UserDto param) {
        return new ResponseEntity<>(userMapper.toDto(userRepository.findById(param.getId())
                                                                    .orElse(null)), HttpStatus.OK);
    }
}
