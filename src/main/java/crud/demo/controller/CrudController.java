package crud.demo.controller;

import crud.demo.controller.requestForm.CreateForm;
import crud.demo.controller.responseForm.BoardListResponseForm;
import crud.demo.controller.responseForm.BoardResponseForm;
import crud.demo.entity.Board;
import crud.demo.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CrudController {
    private static final Logger log = LoggerFactory.getLogger(CrudController.class);

    @Autowired
    private BoardService boardService;

    @PostMapping("/create")
    public void create(@RequestBody CreateForm createForm) {
        log.info("save start");
        boardService.save(createForm);
        log.info("save end");
    }

    @GetMapping("/list")
    public BoardListResponseForm responseList() {

        log.info("list response start");

        List<BoardResponseForm> boardResponseFormList = boardService.list();

        BoardListResponseForm boardListResponseForm = new BoardListResponseForm(boardResponseFormList);

        log.info("list response end");
        return boardListResponseForm;
    }

    @GetMapping("/read/{boardId}")
    public Board readBoard (@PathVariable("boardId") Long boardId) {
        log.info("read start");

        log.info("boardId : " + boardId);

        Board board = boardService.read(boardId);

        log.info("read end");
        return board;
    }
}
