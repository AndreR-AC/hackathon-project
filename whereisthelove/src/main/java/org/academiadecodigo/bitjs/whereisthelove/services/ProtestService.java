package org.academiadecodigo.bitjs.whereisthelove.services;

import org.academiadecodigo.bitjs.whereisthelove.Model.Protest;

import java.util.List;

public interface ProtestService {
    void delete(Integer id);

    void create(Protest protest);

    List<Protest> listProtests();

    void addSupporterToProtest(Integer supporterId, Integer protestId);

    Protest getProtestById(Integer id);
}
