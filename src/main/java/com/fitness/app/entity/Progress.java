package com.fitness.app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "progress")
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<Float> dataPoints;

    private String trends;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    // Getters and Setters
}
