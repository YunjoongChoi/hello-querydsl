package com.practice.helloquerydsl.board.service;

import com.practice.helloquerydsl.board.dto.BoardDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {
    List<BoardDto> getAll(BoardDto param, Pageable pageable);
    List<BoardDto> getBoards(BoardDto param, Pageable pageable);
    BoardDto getBoard(BoardDto param);
}
