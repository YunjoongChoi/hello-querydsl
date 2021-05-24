package com.practice.helloquerydsl.board;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping
    public List<BoardDto> getBoards(final BoardDto param, final Pageable pageable){
        return null;
    }

    @GetMapping({"/{id}"})
    public BoardDto getBoard(@PathVariable final Long id){
        return null;
    }

    @GetMapping({"/dynamic"})
    public List<BoardDto> dynamic(final BoardDto param){
        return null;
    }
}
