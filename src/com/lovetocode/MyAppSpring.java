package com.lovetocode;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.logging.LogManager;

public class MyAppSpring {
    static {
        String configPath = MyAppSpring.class
                .getClassLoader()
                .getResource("logging.properties")
                .getFile();
        configPath = configPath.replace("%20", " ");
        System.setProperty("java.util.logging.config.file", configPath);
        //init JUL with logging.properties
        try {
            LogManager.getLogManager().readConfiguration();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final Log log = LogFactory.getLog(MyAppSpring.class);

    public static void main(String[] args) throws InterruptedException {
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
