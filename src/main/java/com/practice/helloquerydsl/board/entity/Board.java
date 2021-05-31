package com.practice.helloquerydsl.board.entity;

import com.practice.helloquerydsl.board.type.ArticleType;
import com.practice.helloquerydsl.common.entity.CommonDateTimeEntity;
import com.practice.helloquerydsl.user.entity.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends CommonDateTimeEntity {
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
