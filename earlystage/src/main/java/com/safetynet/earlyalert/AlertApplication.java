package com.safetynet.earlyalert;

import com.safetynet.earlyalert.model.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class AlertApplication {

    private static final Logger log = LoggerFactory.getLogger(AlertApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AlertApplication.class, args);
    }

    @GetMapping("/firestation")
    public String firestationURL(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @GetMapping("/childAlert")
    public String childAlert(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @GetMapping("/phoneAlert")
    public String phoneAlert(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @GetMapping("/fire")
    public String fireURL(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @GetMapping("/flood")
    public String flood(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @GetMapping("/personInfo")
    public String personInfo(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @GetMapping("/communityEmail")
    public String communityEmail(@RequestParam(value = "name", defaultValue = "Safetynet") String name) {
        return String.format("Alert %s!", name);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {

            Quote quote = restTemplate.getForObject(
                    "https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json", Quote.class);
            log.info(quote.toString());
        };
    }
}

