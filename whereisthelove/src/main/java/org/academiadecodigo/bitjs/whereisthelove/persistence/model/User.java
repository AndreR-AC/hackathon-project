package org.academiadecodigo.bitjs.whereisthelove.persistence.model;


import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

  @Id
  private Integer id;
  private String firstName;
  private String lastName;
  private Date birthdate;
  private Integer lovePoints;

  @ManyToMany(
    fetch = FetchType.EAGER

  )
  private List<Protest> protests = new ArrayList<>();


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

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public Integer getLovePoints() {
    return lovePoints;
  }

  public void setLovePoints(Integer lovePoints) {
    this.lovePoints = lovePoints;
  }

  public List<Protest> getProtests() {
    return protests;
  }
}
