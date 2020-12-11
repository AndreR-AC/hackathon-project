package org.academiadecodigo.bitjs.whereisthelove.converters;

import org.academiadecodigo.bitjs.whereisthelove.dtos.ProtestDto;
import org.academiadecodigo.bitjs.whereisthelove.persistence.model.Protest;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
public class ProtestDtoToProtest extends AbstractConverter<ProtestDto, Protest> {


  @Override
  public Protest convert(ProtestDto protestDto) {

    Protest protest = new Protest();
    protest.setCause(protestDto.getCause());
    protest.setDate(protestDto.getDate());
    protest.setLocation(protestDto.getLocation());
    protest.setLovePoints(protestDto.getLovePoints());
    protest.setOrg(protestDto.getOrg());
    protest.setImageUrl(protestDto.getImageUrl());

    return protest;
  }


}
