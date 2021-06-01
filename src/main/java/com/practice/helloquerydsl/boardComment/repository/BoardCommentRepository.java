package com.practice.helloquerydsl.boardComment.repository;

import com.practice.helloquerydsl.boardComment.entity.BoardComment;
import com.practice.helloquerydsl.boardComment.repository.custom.CustomBoardComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardCommentRepository extends JpaRepository<BoardComment, Long>, CustomBoardComment {
}
