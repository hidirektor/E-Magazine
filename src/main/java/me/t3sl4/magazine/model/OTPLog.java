package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "OTPLog")
@Data
public class OTPLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "otpLogID", nullable = false)
    private int otpLogID;

    @Column(name = "otpType", nullable = false)
    private String otpType;

    @Column(name = "otpCode", nullable = false)
    private String otpCode;

    @Column(name = "otpTime", nullable = false)
    private Timestamp otpTime;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
