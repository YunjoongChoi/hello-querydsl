package com.practice.helloquerydsl.user;

import com.practice.helloquerydsl.user.dto.UserDto;
import com.practice.helloquerydsl.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getUsers(UserDto param, Pageable pageable){
        return userService.getUsers(param, pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id){
        return userService.getUser(UserDto.builder()
                                                .id(id)
                                            .build());
    }
}
