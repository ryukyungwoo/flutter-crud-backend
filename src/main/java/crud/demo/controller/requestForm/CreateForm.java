package crud.demo.controller.requestForm;

import lombok.*;

@ToString
public class CreateForm {
    private String title;
    private String password;
    private String content;

    public String getTitle() {
        return title;
    }

    public String getPassword() {
        return password;
    }

    public String getContent() {
        return content;
    }
}
