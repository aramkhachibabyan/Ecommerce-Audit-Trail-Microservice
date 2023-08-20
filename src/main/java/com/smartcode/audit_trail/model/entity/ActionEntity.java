
package com.smartcode.notificator.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "actions")
public class ActionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    @Column(nullable = false)
    String actionType;

    @Column(nullable = false)
    String entityType;

    @Column(nullable = false)
    LocalDateTime actionDate;

    @Column(nullable = false)
    Integer userId;
}