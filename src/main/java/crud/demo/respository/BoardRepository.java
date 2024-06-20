package crud.demo.respository;

import crud.demo.controller.responseForm.BoardResponseForm;
import crud.demo.entity.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardRepository {

    private static final Logger log = LoggerFactory.getLogger(BoardRepository.class);

    Map<Long, Board> boardStock = new HashMap<>();

    private Long id = 0L;

    public void save (Board board) {

        log.info("repository save start " + board.toString());

        boardStock.put(id, board);
        id++;
    }

    public List<BoardResponseForm> listInRepository() {

        List<BoardResponseForm> boardResponseFormList = new ArrayList<>();

        List<Long> idList = new ArrayList<>(boardStock.keySet());
        List<Board> boardList = new ArrayList<>(boardStock.values());

        for (int i = 0; i < idList.size(); i++) {
            Long id = idList.get(i);
            Board board = boardList.get(i);

            BoardResponseForm boardResponseForm = new BoardResponseForm(id, board);

            boardResponseFormList.add(boardResponseForm);
        }

        return boardResponseFormList;
    }

    public Board boardFindById(Long boardId) {

        Board board = boardStock.get(boardId);

        return board;
    }
}
