package com.practice.helloquerydsl.board.entity;

import com.practice.helloquerydsl.board.type.ArticleType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Lob
    private String content;
    @Column
    private String writer;
    @Enumerated(EnumType.STRING)
    private ArticleType articleType;
    @Column
    private LocalDateTime registDateTime;
    @Column
    private LocalDateTime updateDateTime;
}
