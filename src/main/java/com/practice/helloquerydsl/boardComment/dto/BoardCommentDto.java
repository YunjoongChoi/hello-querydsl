package com.practice.helloquerydsl.boardComment.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.user.dto.UserDto;
import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardCommentDto {
    private Long boardCommentIdx;
    //@JsonBackReference
    //private BoardDto board;
    private UserDto user;
    private String content;
}
