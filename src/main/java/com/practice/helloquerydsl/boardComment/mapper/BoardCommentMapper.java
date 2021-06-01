package com.practice.helloquerydsl.boardComment.mapper;

import com.practice.helloquerydsl.boardComment.dto.BoardCommentDto;
import com.practice.helloquerydsl.boardComment.entity.BoardComment;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface BoardCommentMapper {
    BoardCommentDto toDto(BoardComment entity);
    List<BoardCommentDto> toDto(List<BoardComment> entity);
    List<BoardCommentDto> toDto(Page<BoardComment> entity);

    BoardComment toEntity(BoardCommentDto dto);
    List<BoardComment> toEntity(List<BoardCommentDto> dto);
    List<BoardComment> toEntity(Page<BoardCommentDto> dto);
}
