package com.practice.helloquerydsl.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class QueryDslConfig {
    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager entityManager){
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);
        return jpaQueryFactory;
    }
}
