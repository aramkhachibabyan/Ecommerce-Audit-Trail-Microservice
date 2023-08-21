package com.smartcode.audit_trail.listener;

import com.smartcode.audit_trail.model.dto.CreateActionDto;
import com.smartcode.audit_trail.service.action.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class ActionKafkaListener {
    private final ActionService actionService;
    private final KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;

    @KafkaListener(
            id = "actionListener",
            topics = "activity",
            groupId = "activity",
            containerFactory = "kafkaListenerContainerFactory",
            properties = {"bootstrap.server=localhost:9092"},
            autoStartup = "${listen.auto.start:true}")
    public void CreateListener(@Payload(required = false) ArrayList<CreateActionDto> list) {
        for (CreateActionDto createActionDto : list) {
            System.out.println("hello");
            actionService.create(createActionDto);
        }

    }
}