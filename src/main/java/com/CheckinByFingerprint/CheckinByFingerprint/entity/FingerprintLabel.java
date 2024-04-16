package com.CheckinByFingerprint.CheckinByFingerprint.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FingerprintLabel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne // Quan hệ nhiều-đến-một với User
//    @JoinColumn(name = "user_id") // Khóa ngoại tham chiếu đến bảng User
//    private User user;

    private String fingerprintImg;
    private LocalDateTime createAt;

}
