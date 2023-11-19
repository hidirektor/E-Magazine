package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "ApproveLog")
@Data
public class ApproveLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "approveLogID", nullable = false)
    private int approveLogID;

    @Column(name = "approveDate", nullable = false)
    private LocalDateTime approveDate;

    @ManyToOne
    @JoinColumn(name = "productID", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
