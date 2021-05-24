package com.practice.helloquerydsl.board.dto;

import com.practice.helloquerydsl.board.type.ArticleType;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String articleType;
    private LocalDateTime registDateTime;
    private LocalDateTime updateDateTime;
}
