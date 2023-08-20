package com.smartcode.audit_trail.mapper;

import com.smartcode.audit_trail.model.dto.CreateActionDto;
import com.smartcode.audit_trail.model.entity.ActionEntity;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    ActionEntity toEntity(CreateActionDto cardDto);
}
