package org.academiadecodigo.bitjs.whereisthelove.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
  @Size(min = 8,max = 10)
  private String birthdate;


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
}
