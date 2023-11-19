package me.t3sl4.magazine.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserPreferences")
@Data
public class UserPreferences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userPreferencesID", nullable = false)
    private int userPreferencesID;

    @Column(name = "selectedTheme", nullable = false)
    private String selectedTheme;

    @Column(name = "selectedLanguage", nullable = false)
    private String selectedLanguage;

    @Column(name = "selectedLowDataMode", nullable = false)
    private boolean selectedLowDataMode;

    @Column(name = "selectedPerformanceMode", nullable = false)
    private boolean selectedPerformanceMode;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;
}
