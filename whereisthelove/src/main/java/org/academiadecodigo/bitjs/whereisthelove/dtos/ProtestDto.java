package org.academiadecodigo.bitjs.whereisthelove.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProtestDto {

  private Integer id;

  @NotNull(message = "Protest date is mandatory")
  @NotBlank(message = "Protest date must not be blank")
  private Date date;

  @NotNull(message = "Cause is mandatory")
  @NotBlank(message = "Cause must not be blank")
  private String cause;


  private String location = null;


  private String org;

  private Integer lovePoints;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

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
}
