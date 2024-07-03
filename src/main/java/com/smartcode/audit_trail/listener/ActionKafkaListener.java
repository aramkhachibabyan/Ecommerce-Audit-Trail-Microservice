package com.smartcode.audit_trail.listener;

import com.smartcode.audit_trail.model.dto.CreateActionDto;
import com.smartcode.audit_trail.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class ActionKafkaListener {
    private final ActionService actionService;

    @KafkaListener(
            id = "actionListener",
            topics = "activity",
            containerFactory = "kafkaListenerContainerFactory",autoStartup = "true")
    public void CreateListener(@Payload(required = false) CreateActionDto createActionDto) {
        actionService.create(createActionDto);
    }
}