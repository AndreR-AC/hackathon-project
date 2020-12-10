package org.academiadecodigo.bitjs.whereisthelove.services;


import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;

import java.util.List;

public interface UserService {
    void delete(Integer id);

    void create(User user);

    List<User> listUsers();

    void addProtestToUser(Integer supporterId, Integer protestId);

    User getUserById(Integer id);
}
