package edu.eurotrans.mapper;

import edu.eurotrans.api.dto.TagDTO;
import edu.eurotrans.dao.entity.TagEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper {

    TagDTO toDTO(TagEntity entity);

    TagDTO toEntity(TagDTO dto);
}
