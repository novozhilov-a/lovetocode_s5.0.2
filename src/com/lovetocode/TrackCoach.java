package com.lovetocode;

public class TrackCoach implements Coach {
    final private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 3 km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
