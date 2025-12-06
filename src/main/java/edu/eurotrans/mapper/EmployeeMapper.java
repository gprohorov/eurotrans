package edu.eurotrans.mapper;

import edu.eurotrans.api.dto.EmployeeDTO;
import edu.eurotrans.api.dto.SimpleEmployeeDTO;
import edu.eurotrans.dao.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmployeeMapper {

    EmployeeDTO toDTO(EmployeeEntity entity);

    EmployeeEntity toEntity(EmployeeDTO employeeDTO);

    EmployeeEntity toEntity(SimpleEmployeeDTO simpleEmployeeDTO);
}
