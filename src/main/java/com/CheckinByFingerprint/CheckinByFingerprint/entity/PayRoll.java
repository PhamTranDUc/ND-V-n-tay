package com.CheckinByFingerprint.CheckinByFingerprint.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayRoll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id") // Tên cột chứa khóa ngoại của User trong bảng PayRoll
    private User user;
    private Long basicSalary;
    private int overTimeHour;
    private Long totalSalary;
}
