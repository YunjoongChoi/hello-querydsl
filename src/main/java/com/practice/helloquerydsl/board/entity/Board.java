package com.practice.helloquerydsl.board.entity;

import com.practice.helloquerydsl.board.type.ArticleType;
import com.practice.helloquerydsl.common.entity.BaseTimeEntity;
import com.practice.helloquerydsl.user.entity.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseTimeEntity {
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
    @OneToOne
    @JoinColumn(name = "USER_IDX")
    private User user;
}
