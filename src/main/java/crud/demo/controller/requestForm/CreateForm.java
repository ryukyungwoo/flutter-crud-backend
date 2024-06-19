package crud.demo.controller.requestForm;

import lombok.*;

@Getter
@ToString
public class CreateForm {
    private String title;
    private String password;
    private String content;
}
