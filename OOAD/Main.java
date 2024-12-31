package com.fitness.app;

import com.fitness.app.entity.*;
import com.fitness.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("securepassword");

        Workout workout = new Workout();
        workout.setType("Cardio");
        workout.setDuration(30);
        workout.setIntensity("High");
        workout.setDate(new Date());
        workout.setUser(user);

        Goal goal = new Goal();
        goal.setGoalType("Weight Loss");
        goal.setTargetValue(5.0f);
        goal.setDeadline(new Date());
        goal.setAchieved(false);
        goal.setUser(user);

        Progress progress = new Progress();
        progress.setTrends("Increasing");
        progress.setUser(user);

        user.setProgress(progress);

        session.save(user);
        transaction.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}
