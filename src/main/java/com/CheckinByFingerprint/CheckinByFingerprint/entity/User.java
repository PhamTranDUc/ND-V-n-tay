package com.CheckinByFingerprint.CheckinByFingerprint.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String avatarUrl;

    private String phoneNumber;

    private String email;

    private String imageFingerPrint;

    private LocalDateTime createTime;

    private String Role;
}
