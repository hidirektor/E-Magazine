package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reviews")
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewID", nullable = false)
    private int reviewID;

    @Column(name = "reviewPoint", nullable = false)
    private int reviewPoint;

    @Column(name = "reviewDescription", nullable = false)
    private String reviewDescription;

    @Column(name = "reviewDate", nullable = false)
    private LocalDateTime reviewDate;

    @ManyToOne
    @JoinColumn(name = "productID", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
