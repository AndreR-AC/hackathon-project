package org.academiadecodigo.bitjs.whereisthelove.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProtestDto {

  private Integer id;

  private String imageUrl;

  @NotNull(message = "Protest date is mandatory")
  @Size(min = 8,max = 10)
  private String date;

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
}
