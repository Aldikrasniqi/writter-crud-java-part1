package com.backend.mappers;

import com.backend.dtos.WritterDto;
import com.backend.models.Writter;
import org.springframework.stereotype.Component;
@Component
public class WritterMapper {
    public WritterDto toDto(Writter writter){
        WritterDto dto = new WritterDto();
        dto.setId(writter.getId());
        dto.setName(writter.getName());
        dto.setSurname(writter.getSurname());
        dto.setDescription(writter.getDescription());
        dto.setGeners(writter.getGeners());
        dto.setPublished(writter.isPublished());
        return dto;
    }
    public Writter toEntity(WritterDto dto){
        Writter writter = new Writter();
        writter.setName(dto.getName());
        writter.setSurname(dto.getSurname());
        writter.setDescription(dto.getDescription());
        writter.setGeners(dto.getGeners());
        writter.setPublished(dto.isPublished());
        return writter;
    }
}
