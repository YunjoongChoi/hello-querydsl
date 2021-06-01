package com.practice.helloquerydsl.boardComment.repository.custom;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CustomBoardCommentImpl implements CustomBoardComment{
    private final JPAQueryFactory query;
}
