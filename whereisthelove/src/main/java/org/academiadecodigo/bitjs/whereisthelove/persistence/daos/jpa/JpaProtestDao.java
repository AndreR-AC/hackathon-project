package org.academiadecodigo.bitjs.whereisthelove.persistence.daos.jpa;

import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.stereotype.Repository;

@Repository
public class JpaProtestDao extends AbstractDao<Protest> {
  /**
   * Initializes a new JPA DAO instance given a model type
   *
   *
   */
  public JpaProtestDao() {
    super(Protest.class);
  }
}