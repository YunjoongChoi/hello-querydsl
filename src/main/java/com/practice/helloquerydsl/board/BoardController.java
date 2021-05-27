package com.practice.helloquerydsl.board;

import com.practice.helloquerydsl.board.dto.BoardDto;
import com.practice.helloquerydsl.board.entity.Board;
import com.practice.helloquerydsl.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

//    @GetMapping
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public List<BoardDto> getBoards(final BoardDto param, final Pageable pageable){
        return boardService.getBoards(param, pageable);
    }

    @GetMapping({"/{id}"})
    public BoardDto getBoard(@PathVariable final Long id){
        return boardService.getBoard(BoardDto.builder()
                                            .id(id)
                                            .build());
    }

    @GetMapping({"/queryDsl"})
    public List<BoardDto> queryDsl(final BoardDto param){
        return boardService.findByWriter(param);
    }
}
