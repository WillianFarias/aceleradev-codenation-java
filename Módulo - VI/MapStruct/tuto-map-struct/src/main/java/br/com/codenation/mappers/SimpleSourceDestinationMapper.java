package br.com.codenation.mappers;

import br.com.codenation.entity.SimpleDestination;
import br.com.codenation.dto.SimpleSource;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//Não é necessario implementar esta interface, pois o MapStruct faz isso por nos

@Mapper
public interface SimpleSourceDestinationMapper {

  SimpleSourceDestinationMapper INSTANCE = Mappers.
    getMapper(SimpleSourceDestinationMapper.class);

  SimpleDestination sourceToDestination(SimpleSource source);
  SimpleSource destinationToSource(SimpleDestination destination);
}