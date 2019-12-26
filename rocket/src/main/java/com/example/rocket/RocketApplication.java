package com.example.rocket;

import com.example.rocket.service.RocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class})
public class RocketApplication implements CommandLineRunner {

    @Autowired
    private RocketService rocketService;

    public static void main(String[] args) {
        SpringApplication.run(RocketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        rocketService.send("Hello RocketMQ");
    }
}
