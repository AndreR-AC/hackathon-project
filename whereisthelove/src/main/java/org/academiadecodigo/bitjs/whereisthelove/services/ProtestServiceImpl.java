package org.academiadecodigo.bitjs.whereisthelove.services;


import org.academiadecodigo.bitjs.whereisthelove.persistence.daos.ProtestDao;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProtestServiceImpl implements ProtestService {

    private ProtestDao protestDao;
    private UserService userService;

    @Override
    public void delete(Integer id){

    }

    @Override
    public void create(Protest protest){
    }

    @Override
    public List<Protest> listProtests(){
        return null;
    }

    @Override
    public void addSupporterToProtest(Integer supporterId, Integer protestId){

    }

    @Override
    public Protest getProtestById(Integer id) {

        return protestDao.findById(id);
    }


    public ProtestDao getProtestDao() {
        return protestDao;
    }

    @Autowired
    public void setProtestDao(ProtestDao protestDao) {
        this.protestDao = protestDao;
    }

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
