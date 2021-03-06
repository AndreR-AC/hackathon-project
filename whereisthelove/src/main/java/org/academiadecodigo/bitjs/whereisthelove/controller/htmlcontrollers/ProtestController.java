package org.academiadecodigo.bitjs.whereisthelove.controller.htmlcontrollers;

import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.academiadecodigo.bitjs.whereisthelove.controller.RestProtestController;
import org.academiadecodigo.bitjs.whereisthelove.converters.ProtestDtoToProtest;
import org.academiadecodigo.bitjs.whereisthelove.dtos.ProtestDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.LinkedList;

@Controller
@RequestMapping(path = "/protest")
public class ProtestController {

    private LinkedList<Protest> protestList ;
    private ProtestDtoToProtest protestDtoToProtest;
    private RestProtestController restProtestController;

    @PostMapping(path = {"","/"} )
    public String createNewProtest(@Valid @ModelAttribute ProtestDto protestDto , BindingResult bindingResult, RedirectAttributes redirectAttributes){

        if (bindingResult.hasErrors()){
            return "errorPage";
        }
        protestList = restProtestController.getProtestList();
        protestDto.setId(protestList.size()+1);
        protestList.add(protestDtoToProtest.convert(protestDto));
        restProtestController.updateList();

        redirectAttributes.addFlashAttribute("lastAction", "the protest " + protestDto.getCause() + " has been created, contributing to " + protestDto.getOrg());
        return "redirect:/";
    }

    @GetMapping("/new")
    public String getProtestForm(){
        return "protestForm";
    }


    public LinkedList<Protest> getProtestList() {
        return protestList;
    }


    public void setProtestList(LinkedList<Protest> protestList) {
        this.protestList = protestList;
    }

    public ProtestDtoToProtest getProtestDtoToProtest() {
        return protestDtoToProtest;
    }

    @Autowired
    public void setProtestDtoToProtest(ProtestDtoToProtest protestDtoToProtest) {
        this.protestDtoToProtest = protestDtoToProtest;
    }

    public RestProtestController getRestProtestController() {
        return restProtestController;
    }

    @Autowired
    public void setRestProtestController(RestProtestController restProtestController) {
        this.restProtestController = restProtestController;
    }

    public void updateList(){
        protestList = restProtestController.getProtestList();
    }
}
