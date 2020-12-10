package org.academiadecodigo.bitjs.whereisthelove.services;

import org.academiadecodigo.bitjs.whereisthelove.Model.User;

import java.util.List;

public interface UserService {
    void delete(Integer id);

    void create(User user);

    List<User> listUsers();

    void addProtestToUser(Integer supporterId, Integer protestId);
}
