package com.practice.helloquerydsl.board.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ArticleType {
    GAME("게임")
    , SPORTS("스포츠")
    , OTHER("그 외");

    private String value;
}
