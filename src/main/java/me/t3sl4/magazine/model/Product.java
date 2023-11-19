package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "Products")
@Data
public class Product {
    @Id
    @Column(name = "productID", nullable = false)
    private String productID;

    @Column(name = "productName", nullable = false)
    private String productName;

    @Column(name = "productDescription", nullable = false)
    private String productDescription;

    @Column(name = "productPrice", precision = 5, scale = 3, nullable = false)
    private BigDecimal productPrice;

    @Column(name = "productReleaseDate", nullable = false)
    private String productReleaseDate;

    @Column(name = "productImageSource", nullable = false)
    private String productImageSource;

    @Column(name = "productPDFSource", nullable = false)
    private String productPDFSource;
}
