package org.academiadecodigo.bitjs.whereisthelove.controller.htmlcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping(path = {"","/"})
    public String indexPageController(){
        return "index";
    }

    @GetMapping(path = "/aboutus")
    public String aboutUsPageController(){ return "aboutUs";}

    @GetMapping(path = "/getbackhome")
    public String homepageRedirect(){ return "redirect:/";}

    @GetMapping(path = "/contactUs")
    public String getContactView(){
        return "contactUs";
    }
}
