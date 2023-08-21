package com.smartcode.audit_trail.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateActionDto {

    private Integer userId;

    private String actionType;

    private String entityType;

    private LocalDateTime actionDate;

}
