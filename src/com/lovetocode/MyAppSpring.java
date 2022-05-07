package com.lovetocode;

import com.lovetocode.config.Logging;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;

public class MyAppSpring {
    private static final Log log = LogFactory.getLog(MyAppSpring.class);

    public static void main(String[] args) throws InterruptedException {
        Logging.setLevel(Level.ALL);

        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.fatal("fatal");

        //load config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext.xml");
        //retrive bean
        Coach myCoach = context.getBean("coach", Coach.class);
        //call bean
        System.out.println(
                "myCoach.getDailyWorkout() = " + myCoach.getDailyWorkout());
        System.out.println(
                "myCoach.getDailyFortune() = " + myCoach.getDailyFortune());
        Thread.sleep(100L);
        //close context
        context.close();
    }
}
