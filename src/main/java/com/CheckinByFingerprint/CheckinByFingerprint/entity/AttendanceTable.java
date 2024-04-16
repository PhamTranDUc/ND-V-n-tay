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
public class AttendanceTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime timeCheckIn;
    private LocalDateTime timeCheckOut;


    @ManyToOne
    private User user;


}
