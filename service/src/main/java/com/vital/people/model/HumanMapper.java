package com.vital.people.model;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HumanMapper {
    HumanEntity toEntity(Human human);
    
    Human toDto(HumanEntity human);
}
