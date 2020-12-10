package org.academiadecodigo.bitjs.whereisthelove.mocks;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "protest")
public class Protest {

    @Id
    private Integer id;

    private Date date;
    private String cause;
    private String location = null;
    private String org;
    private Integer lovePoints;

    @ManyToMany(
      mappedBy = "users",
      fetch = FetchType.LAZY
    )
    private List<User> supporters= new ArrayList<>();


  public Date getDate() {
      return date;
    }
    public void setDate(Date date) {
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
    public List<User> getSupporters() {
      return supporters;
    }
    public void setSupporters(List<User> supporters) {
      this.supporters = supporters;
    }

  public void setId(Integer id) {
    this.id = id;
  }

  @Id
  public Integer getId() {
    return id;
  }
}
