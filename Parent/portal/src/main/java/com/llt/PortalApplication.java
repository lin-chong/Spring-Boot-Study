package com.llt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author llt
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PortalApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplication(PortalApplication.class).run(args);
        ConfigurableEnvironment environment = run.getEnvironment();
        String[] activeProfiles = environment.getActiveProfiles();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        System.out.println("Hello world!");
    }
}