# 개요

- QueryDsl을 익히기 위한 프로젝트 입니다
- 아래의 내용을 모두 다룰 수 있는 프로젝트를 백엔드 중점으로 간략히 코딩합니다.
- 화면을 생략합니다.
    - 모든 요청을 URL을 이용한 GET 방식으로 보내고, 그 결과를 JSON 형태로 받도록 합니다.
- 게시판 정도의 도메인

# 포함할 내용

- `QueryDsl`
- `QueryDsl BooleanBuilder`를 이용한 동적 쿼리
- `QueryDsl`을 이용한 Join

# 작업사항

## 프로젝트명

> hello-querydsl

- groupid : com.practice
- artifacts : helloquerydsl

## 스택

- Java 8
- Spring Boot 2.5.0
- Spring Boot Devtools
- Lombok
- Spring Configuration Processor
- Spring Web MVC
- Spring Data JPA
- QueryDsl 4.2.2
- H2
- JUnit 5
- Spring REST Docs


## 기능

- 게시물 조회

## 주요사항

- 화면 생략
  - 모든 요청을 URL을 이용한 GET방식으로 보내고, 결과는 JSON으로 확인한다.
- Test 코드 작성