package edu.eurotrans.mapper;

import edu.eurotrans.api.dto.CompanyDTO;
import edu.eurotrans.dao.entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CompanyMapper {
    CompanyEntity toEntity(CompanyDTO dto);

    CompanyDTO toDTO(CompanyEntity company);
}
