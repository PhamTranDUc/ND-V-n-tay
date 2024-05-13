package com.CheckinByFingerprint.CheckinByFingerprint.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
// Mẫu Training
public class TrainingTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String linkImage;
    private String statusTraining;
    private String name;
    @ManyToOne
    private User user;

    @ManyToMany
    @JoinTable(
            name = "trainingdata_model", // Tên của bảng trung gian
            joinColumns = @JoinColumn(name = "trainingdata_id"), // Tên cột trong bảng trung gian liên kết với TrainingData
            inverseJoinColumns = @JoinColumn(name = "model_id") // Tên cột trong bảng trung gian liên kết với Model
    )
    private Set<TrainingModel> models;

}
