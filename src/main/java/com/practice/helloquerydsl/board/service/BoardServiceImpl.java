package com.practice.helloquerydsl.board.service;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardRepository boardRepository;

    @Override
    public List<BoardDto> getBoards(BoardDto param, Pageable pageable) {
        return null;
    }

    @Override
    public BoardDto getBoard(BoardDto param) {
        return null;
    }
}
