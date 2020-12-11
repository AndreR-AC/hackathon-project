package org.academiadecodigo.bitjs.whereisthelove.controller.htmlcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping(path = {"","/"})
    public String indexPageController(){
        return "userForm";
    }
}
