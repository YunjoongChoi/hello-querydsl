package com.practice.helloquerydsl.board.repository.custom;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomBoardRepository {
    List<Board> getBoardsDynamically(BoardDto param, Pageable pageable);
}
