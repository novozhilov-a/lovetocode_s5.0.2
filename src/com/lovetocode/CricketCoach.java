package com.lovetocode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private final static Log LOG = LogFactory.getLog(CricketCoach.class);

    protected String email;
    protected String name;

    public CricketCoach() {
        System.out.println("Inside constructor "+this.getClass().getName());
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println( "Inside setter setFortuneService "+this.getClass().getName());
        this.fortuneService = fortuneService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDailyWorkout() {
        return name + " says: Practice cricket";
    }

    @Override
    public String getDailyFortune() {
        return email + " " + fortuneService.getFortune();
    }
}
