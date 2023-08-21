package com.smartcode.audit_trail.mapper;

import com.smartcode.audit_trail.model.dto.CreateActionDto;
import com.smartcode.audit_trail.model.entity.ActionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActionMapper {

    ActionEntity toEntity(CreateActionDto cardDto);
}
