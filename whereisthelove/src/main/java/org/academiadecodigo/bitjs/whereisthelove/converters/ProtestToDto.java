package org.academiadecodigo.bitjs.whereisthelove.converters;

import org.academiadecodigo.bitjs.whereisthelove.dtos.ProtestDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.stereotype.Component;

@Component
public class ProtestToDto extends AbstractConverter<Protest, ProtestDto> {
  @Override
  public ProtestDto convert(Protest protest) {

    ProtestDto protestDto = new ProtestDto();
    protestDto.setCause(protest.getCause());
    protestDto.setDate(protest.getDate());
    protestDto.setLocation(protest.getLocation());
    protestDto.setLovePoints(protest.getLovePoints());
    protestDto.setOrg(protest.getOrg());

    return protestDto;
  }
}
