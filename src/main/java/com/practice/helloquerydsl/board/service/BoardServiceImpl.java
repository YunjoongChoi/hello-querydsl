package com.practice.helloquerydsl.board.service;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.entity.Board;
import com.practice.helloquerydsl.board.mapper.BoardMapper;
import com.practice.helloquerydsl.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDto> getBoards(BoardDto param, Pageable pageable) {
        return boardMapper.toDto(boardRepository.getBoardsDynamically(param, pageable));
    }

    @Override
    public BoardDto getBoard(BoardDto param) {
        return boardMapper.toDto(boardRepository.findById(param.getId())
                                                                .orElse(null));
    }

    @Override
    public List<BoardDto> findByWriter(BoardDto param) {
        return boardMapper.toDto(boardRepository.findByWriter(param.getWriter()));
    }
}
