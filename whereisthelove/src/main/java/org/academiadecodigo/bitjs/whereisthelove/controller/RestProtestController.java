package org.academiadecodigo.bitjs.whereisthelove.controller;


import org.academiadecodigo.bitjs.whereisthelove.controller.htmlcontrollers.ProtestController;
import org.academiadecodigo.bitjs.whereisthelove.converters.ProtestDtoToProtest;
import org.academiadecodigo.bitjs.whereisthelove.dtos.ProtestDto;
import org.academiadecodigo.bitjs.whereisthelove.dtos.UserDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;


@RestController
@RequestMapping(path = "/protest")
public class RestProtestController {

    private ProtestController protestController;
    private LinkedList<Protest> protestList = new LinkedList<>();
    private ProtestDtoToProtest protestDtoToProtest;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Protest>> getProtests() {

        return new ResponseEntity<>(protestList, HttpStatus.OK);

    }



    @GetMapping( path = "/{id}")
    public ResponseEntity<Protest> getProtestbyId(@PathVariable Integer id){

        return  new ResponseEntity<>(protestList.get(id-1),HttpStatus.OK);
    }

    @GetMapping(path = "/fillwithdefaults")
    public ResponseEntity fillWithDefaults(){

        Protest protest = new Protest();
        protest.setId(1);
        protest.setCause("Black Lives Matter");
        protest.setDate("25-12-2020");
        protest.setLocation("Praça Velha, Ilha Terceira, Açores");
        protest.setOrg("Black Lives Matter Portugal");
        protest.setImageUrl("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.esquerda.net%2Fdossier%2Fblacklivesmatter-um-movimento-da-internet-para-ruas%2F68372&psig=AOvVaw0inqxADw4yNSGfL2SVQknl&ust=1607711090439000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCICi_9aExO0CFQAAAAAdAAAAABAD");
        protestList.add(protest);
        Protest protest1 = new Protest();
        protest1.setId(2);
        protest1.setCause("Protesto Pela Restauração durante a Pandemia");
        protest1.setDate("31-12-2020");
        protest1.setLocation("Pátio da Alfandega, Ilha Terceira, Açores");
        protest1.setOrg("Distribuição de Fundos para Restauração");
        protest1.setImageUrl("http://www.cgtp.pt/images/accao-e-luta/2020/12/Protesto_da_restaura%C3%A7%C3%A3o_e_hot%C3%A9is_em_Lisboa.jpg");
        protestList.add(protest1);

        return new ResponseEntity(HttpStatus.OK);
    }

    public void updateList(){
        protestList = protestController.getProtestList();
    }

    public ProtestDtoToProtest getProtestDtoToProtest() {
        return protestDtoToProtest;
    }

    public LinkedList<Protest> getProtestList() {
        return protestList;
    }

    public void setProtestList(LinkedList<Protest> protestList) {
        this.protestList = protestList;
    }

    @Autowired
    public void setProtestDtoToProtest(ProtestDtoToProtest protestDtoToProtest) {
        this.protestDtoToProtest = protestDtoToProtest;
    }

    public ProtestController getProtestController() {
        return protestController;
    }
    @Autowired
    public void setProtestController(ProtestController protestController) {
        this.protestController = protestController;
    }
}
