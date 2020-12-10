package org.academiadecodigo.bitjs.whereisthelove.services;

import org.academiadecodigo.bitjs.whereisthelove.persistence.daos.ProtestDao;
import org.academiadecodigo.bitjs.whereisthelove.persistence.daos.UserDao;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserDao userDao;
    private ProtestDao protestDao;

    @Override
    public void delete(Integer id){
        userDao.delete(id);
    }

    @Override
    public void create(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public List<User> listUsers(){
        return userDao.findAll();
    };

    @Override
    public void addProtestToUser(Integer supporterId, Integer protestId){
        userDao.findById(supporterId).addProtest(protestDao.findById(protestId));
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.findById(id);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public ProtestDao getProtestDao() {
        return protestDao;
    }

    @Autowired
    public void setProtestDao(ProtestDao protestDao) {
        this.protestDao = protestDao;
    }
}
