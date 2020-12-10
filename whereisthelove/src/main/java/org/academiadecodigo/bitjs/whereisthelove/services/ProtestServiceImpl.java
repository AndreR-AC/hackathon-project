package org.academiadecodigo.bitjs.whereisthelove.services;


import org.academiadecodigo.bitjs.whereisthelove.persistence.daos.ProtestDao;
import org.academiadecodigo.bitjs.whereisthelove.persistence.daos.UserDao;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProtestServiceImpl implements ProtestService {

    private ProtestDao protestDao;
    private UserDao userDao;

    @Override
    @Transactional
    public void delete(Integer id){
        protestDao.delete(id);
    }

    @Override
    @Transactional
    public void create(Protest protest){
        protestDao.saveOrUpdate(protest);
    }

    @Override
    @Transactional
    public List<Protest> listProtests(){
        return protestDao.findAll();
    }

    @Override
    @Transactional
    public void addSupporterToProtest(Integer supporterId, Integer protestId){
        protestDao.findById(protestId).addSupporter(userDao.findById(supporterId));
    }

    @Override
    @Transactional
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


    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
