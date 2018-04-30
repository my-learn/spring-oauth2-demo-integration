package edu.maskleo.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.maskleo.oauth2"})
public class SpringOauth2DemoIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2DemoIntegrationApplication.class, args);
    }
}
