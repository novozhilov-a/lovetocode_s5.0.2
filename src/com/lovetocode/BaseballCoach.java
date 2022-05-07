package com.lovetocode;

public class BaseballCoach implements Coach {
    final private FortuneService fortuneService;

    protected BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "30 minutes batting";
    }
}
