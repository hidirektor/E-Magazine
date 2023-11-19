package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "Purchases")
@Data
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productID", nullable = false)
    private int productID;

    @Column(name = "productName", nullable = false)
    private String productName;

    @Column(name = "productDescription", nullable = false)
    private String productDescription;

    @Column(name = "productPrice", precision = 5, scale = 3, nullable = false)
    private String productPrice;

    @Column(name = "orderDate", nullable = false)
    private Timestamp orderDate;

    @Column(name = "paymentMethod", nullable = false)
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
