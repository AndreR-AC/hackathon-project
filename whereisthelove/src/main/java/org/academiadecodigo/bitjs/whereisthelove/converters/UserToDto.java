package org.academiadecodigo.bitjs.whereisthelove.converters;

import org.academiadecodigo.bitjs.whereisthelove.dtos.UserDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserToDto extends AbstractConverter<User, UserDto> {


  @Override
  public UserDto convert(User user) {

    UserDto userDto = new UserDto();
    userDto.setFirstName(user.getFirstName());
    userDto.setLastName(user.getLastName());
    userDto.setBirthdate(user.getBirthdate());
    userDto.setLovePoints(user.getLovePoints());

    return userDto;
  }
}
