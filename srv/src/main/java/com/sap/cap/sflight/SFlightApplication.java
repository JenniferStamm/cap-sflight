package com.sap.cap.sflight;

import org.slf4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SFlightApplication {
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SFlightApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SFlightApplication.class, args);
    }

    @Scheduled(fixedRate = 5000)
    public void logHealth() {
        logger.info("local application healthy");
        logger.debug("local application healthy");
    }

}