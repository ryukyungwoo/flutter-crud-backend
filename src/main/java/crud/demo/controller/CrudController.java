package crud.demo.controller;

import crud.demo.controller.requestForm.CreateForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CrudController {
    private static final Logger log = LoggerFactory.getLogger(CrudController.class);

    @PostMapping("/create")
    public void create(@RequestBody CreateForm createForm) {
        log.info(createForm.toString());
    }
}
