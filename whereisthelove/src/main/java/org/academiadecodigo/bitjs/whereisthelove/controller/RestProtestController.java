package org.academiadecodigo.bitjs.whereisthelove.controller;


import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.academiadecodigo.bitjs.whereisthelove.services.ProtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/protest")
public class RestProtestController {

    private ProtestService protestService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<Protest>> getProtests() {

        return new ResponseEntity<>(protestService.listProtests(), HttpStatus.OK);

    }

    @GetMapping( path = "/{id}")
    public ResponseEntity<Protest> getProtestbyId(@PathVariable Integer id){

        return  new ResponseEntity<>(protestService.getProtestById(id),HttpStatus.OK);
    }


    public ProtestService getProtestService() {
        return protestService;
    }

    @Autowired
    public void setProtestService(ProtestService protestService) {
        this.protestService = protestService;
    }
}
