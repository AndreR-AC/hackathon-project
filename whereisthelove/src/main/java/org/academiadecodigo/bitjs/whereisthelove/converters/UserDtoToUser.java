package org.academiadecodigo.bitjs.whereisthelove.converters;

import org.academiadecodigo.bitjs.whereisthelove.dtos.UserDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.User;
import org.springframework.stereotype.Component;


@Component
public class UserDtoToUser extends AbstractConverter<UserDto, User> {
  @Override
  public User convert(UserDto userDto) {

    User user = new User();
    user.setFirstName(userDto.getFirstName());
    user.setLastName(userDto.getLastName());
    user.setBirthdate(userDto.getBirthdate());
    user.setLovePoints(userDto.getLovePoints());

    return user;
  }
}
