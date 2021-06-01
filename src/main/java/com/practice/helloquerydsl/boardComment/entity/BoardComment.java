package com.practice.helloquerydsl.boardComment.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.practice.helloquerydsl.board.entity.Board;
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
public class BoardComment extends CommonDateTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardCommentIdx;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_IDX")
    private Board board;
    @OneToOne
    @JoinColumn(name = "USER_IDX")
    private User user;
    @Column
    private String content;
}
