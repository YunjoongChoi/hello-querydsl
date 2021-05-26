package com.practice.helloquerydsl.board.repository;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.entity.Board;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.practice.helloquerydsl.board.entity.QBoard.board;

@Repository
@AllArgsConstructor
public class CustomBoardRepositoryImpl implements CustomBoardRepository{
    private final JPAQueryFactory query;

    @Override
    public List<Board> findByWriter(String name) {
        return query.selectFrom(board)
                    .where(board.writer.eq(name))
                    .orderBy(board.writer.desc())
                    .fetch();
    }

    @Override
    public List<Board> getBoardsDynamically(BoardDto param, Pageable pageable) {
        BooleanBuilder booleanBuilder = new BooleanBuilder();

        if(StringUtils.hasLength(param.getWriter())){
            booleanBuilder.and(board.writer.eq(param.getWriter()));
        }
        if(StringUtils.hasText(param.getTitle())){
            booleanBuilder.and(board.title.contains(param.getTitle()));
        }
        if(StringUtils.hasText(param.getContent())){
            booleanBuilder.and(board.content.contains(param.getContent()));
        }

        return query.selectFrom(board)
                    .where(booleanBuilder)
                    .limit(pageable.getPageSize())
                    .offset(pageable.getOffset())
                    .fetch();
    }
}
