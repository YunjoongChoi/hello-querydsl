package com.practice.helloquerydsl.user.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String userId;
    private String nickname;
    private LocalDateTime registDateTime;
    private LocalDateTime updateDateTime;

    private LocalDateTime from;
    private LocalDateTime to;
}
