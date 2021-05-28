package com.practice.helloquerydsl.board.repository.custom;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.entity.Board;
import com.practice.helloquerydsl.user.entity.User;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.practice.helloquerydsl.board.entity.QBoard.board;
import static com.practice.helloquerydsl.user.entity.QUser.user;

@Repository
@AllArgsConstructor
public class CustomBoardRepositoryImpl implements CustomBoardRepository{
    private final JPAQueryFactory query;

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

        return query/*.select(Projections.fields(Board.class
                            , board.id
                            , board.title
                            , board.content
                            , board.writer
                            , board.articleType
                            , board.registDateTime
                            , board.updateDateTime
                            , user.userIdx
                            , user.userId
                            , user.nickname))
                    .from(board)*/
                    .selectFrom(board)
                    .leftJoin(board.user, user)
                    .on(board.user.userIdx.eq(user.userIdx))
                    .where(booleanBuilder)
                    .offset(pageable.getOffset())
                    .limit(pageable.getPageSize())
                    .orderBy(board.id.asc(), board.updateDateTime.desc())
                    .fetch();
    }
}
