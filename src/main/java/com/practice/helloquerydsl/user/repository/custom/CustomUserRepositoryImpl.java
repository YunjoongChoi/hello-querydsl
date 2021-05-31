package com.practice.helloquerydsl.user.repository.custom;

import com.practice.helloquerydsl.user.entity.User;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

import static com.practice.helloquerydsl.user.entity.QUser.user;

@Repository
@AllArgsConstructor
public class CustomUserRepositoryImpl implements CustomUserRepository{
    private final JPAQueryFactory query;

    @Override
    public List<User> getUsersDynamically(User param, Pageable pageable, LocalDateTime from, LocalDateTime to) {
        BooleanBuilder booleanBuilder = getUsersDynamicallyBooleanBuilder(param, from, to);

        return query.select(Projections.fields(User.class
                                                , user.userIdx
                                                , user.userId
                                                , user.nickname
                                                , user.registDateTime
                                                , user.updateDateTime))
                    .from(user)
                    .where(booleanBuilder)
                    .orderBy(user.userIdx.asc())
                    .fetch();
    }

    private BooleanBuilder getUsersDynamicallyBooleanBuilder(User param, LocalDateTime from, LocalDateTime to){
        BooleanBuilder booleanBuilder = new BooleanBuilder();

        /*id*/
        if(StringUtils.hasLength(param.getUserId())){
            booleanBuilder.and(user.userId.eq(param.getUserId()));
        }

        /*nickname*/
        if(StringUtils.hasText(param.getNickname())){
            booleanBuilder.and(user.nickname.contains(param.getNickname()));
        }

        /*registDateTime*/
        if(from!=null && to==null){
            booleanBuilder.and(user.registDateTime.after(from));
        }else if(from==null && to!=null){
            booleanBuilder.and(user.registDateTime.before(to));
        }else if(from!=null & to!=null){
            booleanBuilder.and(user.registDateTime.between(from, to));
        }

        return booleanBuilder;
    }
}
