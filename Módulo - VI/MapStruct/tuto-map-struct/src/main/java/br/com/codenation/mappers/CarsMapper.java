package br.com.codenation.mappers;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import br.com.codenation.dto.CarDTO;
import br.com.codenation.dto.FuelType;
import br.com.codenation.entity.BioDieselCar;
import br.com.codenation.entity.Car;
import br.com.codenation.entity.ElectricCar;

@Mapper
public abstract class CarsMapper {

    @BeforeMapping
    protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDto) {
        if (car instanceof ElectricCar)
            carDto.setFuelType(FuelType.ELECTRIC);
        if (car instanceof BioDieselCar)
            carDto.setFuelType(FuelType.BIO_DIESEL);
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDTO carDto) {
        carDto.setName(carDto.getName().toUpperCase());
    }

    //aqui é onde o mapeamento é feito
    public abstract CarDTO toCarDto(Car car);

}
