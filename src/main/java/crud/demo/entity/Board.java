package crud.demo.entity;

import lombok.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
public class Board {
    private String title;
    private String password;
    private String content;

    public Board(String title, String password, String content) {
        this.title = title;
        this.password = password;
        this.content = content;
    }

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
