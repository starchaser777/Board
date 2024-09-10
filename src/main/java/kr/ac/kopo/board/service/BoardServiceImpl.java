package kr.ac.kopo.board.service;

import kr.ac.kopo.board.dto.BoardDTO;
import kr.ac.kopo.board.entity.Board;
import kr.ac.kopo.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repository;

    @Override
    public Long register(BoardDTO dto) {
        Board board = dtoToEntity(dto);
        repository.save(board);
        return board.getBno();
    }
}
