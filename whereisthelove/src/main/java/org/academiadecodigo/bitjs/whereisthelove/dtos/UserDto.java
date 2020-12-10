package org.academiadecodigo.bitjs.whereisthelove.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDto {


  private Integer id;

  @NotNull(message = "First name is mandatory")
  @NotBlank(message = "First name must not be blank")
  private String firstName;

  @NotNull(message = "Last name is mandatory")
  @NotBlank(message = "Last name must not be blank")
  private String lastName;


  @NotNull(message = "Birthdate is mandatory")
  @NotBlank(message = "Birthdate must not be blank")

  private Date birthdate;


  private Integer lovePoints;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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
}
