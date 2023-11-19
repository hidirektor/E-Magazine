package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "RoleLog")
@Data
public class RoleLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleLogID", nullable = false)
    private int roleLogID;

    @Column(name = "processType", nullable = false)
    private String processType;

    @Column(name = "processTime", nullable = false)
    private LocalDateTime processTime;

    @Column(name = "effectedUser", nullable = false)
    private String effectedUser;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
