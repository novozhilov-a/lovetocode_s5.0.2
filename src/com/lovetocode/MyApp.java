package com.lovetocode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyApp {
    private final Log log = LogFactory.getLog(getClass());

    public static void main(String[] args) {
        Coach coach = new TrackCoach(new HappyFortuneService());
        String dailyWorkout = coach.getDailyWorkout();
        System.out.println("dailyWorkout = " + dailyWorkout);
        new MyApp().log.info("yo");

    }
}
