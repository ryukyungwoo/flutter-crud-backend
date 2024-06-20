package crud.demo.controller.responseForm;

import lombok.Getter;

import java.util.List;

@Getter
public class BoardListResponseForm {
    private List<BoardResponseForm> boardListResponseForm;

    public BoardListResponseForm(List<BoardResponseForm> boardListResponseForm) {
        this.boardListResponseForm = boardListResponseForm;
    }
}
