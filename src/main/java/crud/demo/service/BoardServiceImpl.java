package crud.demo.service;

import crud.demo.controller.requestForm.CreateForm;
import crud.demo.controller.responseForm.BoardListResponseForm;
import crud.demo.controller.responseForm.BoardResponseForm;
import crud.demo.entity.Board;
import crud.demo.respository.BoardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
    @Autowired
    private BoardRepository boardRepository;

    @Override
    public void save(CreateForm createForm) {

        log.info("Service save start " + createForm.toString());

        final String title = createForm.getTitle();
        final String password = createForm.getPassword();
        final String content = createForm.getContent();

        Board board = new Board(title, password, content);

        boardRepository.save(board);
    }

    @Override
    public List<BoardResponseForm> list() {

        List<BoardResponseForm> boardResponseFormList = boardRepository.listInRepository();

        return boardResponseFormList;
    }

    @Override
    public Board read(Long boardId) {

        Board board = boardRepository.boardFindById(boardId);

        return board;
    }
}
