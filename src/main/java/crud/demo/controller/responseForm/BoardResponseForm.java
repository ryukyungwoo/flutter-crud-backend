package crud.demo.controller.responseForm;

import crud.demo.entity.Board;
import lombok.Getter;

@Getter
public class BoardResponseForm {
    private Long id;
    private Board board;

    public BoardResponseForm(Long id, Board board) {
        this.id = id;
        this.board = board;
    }
}
