package com.CheckinByFingerprint.CheckinByFingerprint.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TrainningTemplateDto {

    private Long id;

    private String linkImage;
    private String name;
    private String statusTraining;

    private Long userId;


}
