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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Float> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<Float> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public String getTrends() {
        return trends;
    }

    public void setTrends(String trends) {
        this.trends = trends;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
