package com.CheckinByFingerprint.CheckinByFingerprint.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TrainingModelDto {

    private Long id;
    private String name;
    private String isActive;
}
