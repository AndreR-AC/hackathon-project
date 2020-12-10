package org.academiadecodigo.bitjs.whereisthelove.controller;

import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
import org.academiadecodigo.bitjs.whereisthelove.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class RestUserController {


    private UserService userService;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<User>> getUsers() {

        return new ResponseEntity<>(userService.listUsers(), HttpStatus.OK);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> getProtestbyId(@PathVariable Integer id) {

        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
