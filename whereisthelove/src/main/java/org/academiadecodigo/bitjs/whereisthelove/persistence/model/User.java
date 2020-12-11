package org.academiadecodigo.bitjs.whereisthelove.persistence.model;


import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User {


  private Integer id;
  private String firstName;
  private String lastName;
  private String birthdate;
  private Integer lovePoints;
  private String passwordHash;


//  private List<Protest> protests = new ArrayList<>();

  /*public void addProtest(Protest protest){
    protests.add(protest);
  }*/

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getId() {
    return id;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public Integer getLovePoints() {
    return lovePoints;
  }

  public void setLovePoints(Integer lovePoints) {
    this.lovePoints = lovePoints;
  }

  /*public List<Protest> getProtests() {
    return protests;
  }

*/

  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }
}
