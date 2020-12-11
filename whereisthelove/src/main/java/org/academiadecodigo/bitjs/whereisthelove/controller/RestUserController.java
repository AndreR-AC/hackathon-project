package org.academiadecodigo.bitjs.whereisthelove.controller;

import org.academiadecodigo.bitjs.whereisthelove.controller.htmlcontrollers.UserController;
import org.academiadecodigo.bitjs.whereisthelove.converters.UserDtoToUser;
import org.academiadecodigo.bitjs.whereisthelove.dtos.UserDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class RestUserController {

    private LinkedList<User> userLinkedList = new LinkedList<>();
    private UserDtoToUser userDtoToUser;
    private UserController userController;

    @GetMapping(path = {"", "/"})
    public ResponseEntity<List<User>> getUsers() {

        return new ResponseEntity<>(userLinkedList, HttpStatus.OK);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> getProtestbyId(@PathVariable Integer id) {

        return new ResponseEntity<>(userLinkedList.get(id-1), HttpStatus.OK);
    }

    @PostMapping(path = {"", "/"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createNewUser(@Valid @RequestBody UserDto userDto) {

        userDto.setId(userLinkedList.size() + 1);
        userLinkedList.add(userDtoToUser.convert(userDto));
        return new ResponseEntity(HttpStatus.OK);
    }

    public void updatelist() {
        userLinkedList = userController.getUserLinkedList();
    }

    public UserDtoToUser getUserDtoToUser() {
        return userDtoToUser;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    public LinkedList<User> getUserLinkedList() {
        return userLinkedList;
    }

    public void setUserLinkedList(LinkedList<User> userLinkedList) {
        this.userLinkedList = userLinkedList;
    }

    public UserController getUserController() {
        return userController;
    }

    @Autowired
    public void setUserController(UserController userController) {
        this.userController = userController;
    }
}
