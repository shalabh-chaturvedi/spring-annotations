package com.example.demo;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }
}
