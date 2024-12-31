package com.fitness.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "goals")
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String goalType;
    private float targetValue;

    @Temporal(TemporalType.DATE)
    private Date deadline;

    private boolean isAchieved;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters and Setters
}
