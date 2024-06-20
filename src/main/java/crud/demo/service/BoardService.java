package crud.demo.service;

import crud.demo.controller.requestForm.CreateForm;
import crud.demo.controller.responseForm.BoardResponseForm;
import crud.demo.entity.Board;

import java.util.List;

public interface BoardService {
    void save(CreateForm createForm);

    List<BoardResponseForm> list();

    Board read(Long boardId);
}
