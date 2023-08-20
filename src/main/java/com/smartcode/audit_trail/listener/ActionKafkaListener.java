package com.smartcode.notificator.listener;

import com.smartcode.notificator.model.dto.CreateNotificationDto;
import com.smartcode.notificator.service.notification.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class NotificationKafkaListener {
    private final NotificationService notificationService;

    @KafkaListener(
            topics = "notify",
            containerFactory = "kafkaListenerContainerFactory",
            autoStartup = "${listen.auto.start:false}")
    public void CreateListener(CreateNotificationDto notificationDto) {
        notificationService.create(notificationDto);

    }
}