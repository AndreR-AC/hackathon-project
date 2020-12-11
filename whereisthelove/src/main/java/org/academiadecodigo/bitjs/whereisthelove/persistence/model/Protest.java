package org.academiadecodigo.bitjs.whereisthelove.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;



public class Protest {


  private Integer id;
  private String imageUrl;
  private String date;
  private String cause;
  private String location = null;
  private String org;
  private Integer lovePoints;


//  private List<User> supporters = new LinkedList<>();

/*  public void addSupporter(User user){
        supporters.add(user);
    }*/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }

  public Integer getLovePoints() {
    return lovePoints;
  }

  public void setLovePoints(Integer lovePoints) {
    this.lovePoints = lovePoints;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getId() {
    return id;
  }
}
