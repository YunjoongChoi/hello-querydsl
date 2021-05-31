package com.practice.helloquerydsl.user.mapper;

import com.practice.helloquerydsl.user.dto.UserDto;
import com.practice.helloquerydsl.user.entity.User;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User entity);
    List<UserDto> toDto(List<User> entity);
    List<UserDto> toDto(Page<User> entity);

    User toEntity(UserDto dto);
    List<User> toEntity(List<UserDto> dto);
    List<User> toEntity(Page<User> dto);
}
