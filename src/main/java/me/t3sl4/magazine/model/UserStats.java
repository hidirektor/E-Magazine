package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "UserStats")
@Data
public class UserStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userStatsID", nullable = false)
    private int userStatsID;

    @Column(name = "activityDuration", nullable = false)
    private String activityDuration;

    @Column(name = "firstLogin", nullable = false)
    private LocalDateTime firstLogin;

    @Column(name = "lastLogin", nullable = false)
    private LocalDateTime lastLogin;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
