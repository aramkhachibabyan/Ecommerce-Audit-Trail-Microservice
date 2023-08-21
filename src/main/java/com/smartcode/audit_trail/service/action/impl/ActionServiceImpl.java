package com.smartcode.audit_trail.service.action.impl;

import com.smartcode.audit_trail.mapper.ActionMapper;
import com.smartcode.audit_trail.model.dto.CreateActionDto;
import com.smartcode.audit_trail.model.entity.ActionEntity;
import com.smartcode.audit_trail.repository.ActionRepository;
import com.smartcode.audit_trail.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {
    private final ActionRepository actionRepository;
    private final ActionMapper actionMapper;

    @Override
    @Transactional
    public void create(CreateActionDto actionDto) {
        ActionEntity entity = actionMapper.toEntity(actionDto);
        actionRepository.save(entity);
    }

}
