package org.academiadecodigo.bitjs.whereisthelove.controller.htmlcontrollers;

import org.academiadecodigo.bitjs.whereisthelove.controller.RestUserController;
import org.academiadecodigo.bitjs.whereisthelove.converters.UserDtoToUser;
import org.academiadecodigo.bitjs.whereisthelove.dtos.UserDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
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
@RequestMapping(path = "/user")
public class UserController {

    private LinkedList<User> userLinkedList = new LinkedList<>();
    private UserDtoToUser userDtoToUser;
    private RestUserController restUserController;

    @PostMapping(path = {"","/"} )
    public String createNewUser( @ModelAttribute UserDto userDto , RedirectAttributes redirectAttributes){


        redirectAttributes.addFlashAttribute("lastAction"," "+userDto.getFirstName()+" just logged in");
        return "redirect:/";
    }

    @GetMapping("/login")
    public String getSignInForm(){
        return "signIn";
    }


    public void updatelist(){
        userLinkedList = restUserController.getUserLinkedList();
    }

    public LinkedList<User> getUserLinkedList() {
        return userLinkedList;
    }

    public void setUserLinkedList(LinkedList<User> userLinkedList) {
        this.userLinkedList = userLinkedList;
    }

    public UserDtoToUser getUserDtoToUser() {
        return userDtoToUser;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    public RestUserController getRestUserController() {
        return restUserController;
    }

    @Autowired
    public void setRestUserController(RestUserController restUserController) {
        this.restUserController = restUserController;
    }
}
