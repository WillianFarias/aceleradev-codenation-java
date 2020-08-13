package br.com.codenation.mappers;

import br.com.codenation.dto.EmployeeDTO;
import br.com.codenation.dto.DivisionDTO;
import br.com.codenation.entity.Employee;
import br.com.codenation.entity.Division;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper
public interface EmployeeMapper {

  //Vetor de atributos que nao possuem os mesmos nomes em ambas as classes
    @Mappings({ @Mapping(target = "employeeId", source = "entity.id"), 
      @Mapping(target = "employeeName", source = "entity.name"), 
      @Mapping(target = "employeeStartDt",
        source = "entity.startDt", dateFormat = "dd-MM-yyyy HH:mm:ss") })
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mappings({ @Mapping(target = "id", source = "dto.employeeId"),
     @Mapping(target = "name", source = "dto.employeeName"),
     @Mapping(target = "startDt", source = "dto.employeeStartDt",
      dateFormat = "dd-MM-yyyy HH:mm:ss") })
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

    DivisionDTO divisionToDivisionDTO(Division entity);

    Division divisionDTOtoDivision(DivisionDTO dto);

    List<Employee> convertEmployeeDTOListToEmployeeList(List<EmployeeDTO> list);

    List<EmployeeDTO> convertEmployeeListToEmployeeDTOList(List<Employee> list);

}
