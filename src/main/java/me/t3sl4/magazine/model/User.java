package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable = false)
    private int userID;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "nameSurname", nullable = false)
    private String nameSurname;

    @Column(name = "eMail", nullable = false)
    private String eMail;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    private String password;
}
