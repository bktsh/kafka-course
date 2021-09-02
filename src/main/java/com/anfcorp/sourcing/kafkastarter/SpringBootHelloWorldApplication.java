package com.anfcorp.sourcing.kafkastarter;

import com.anfcorp.sourcing.kafkastarter.config.KafkaProducerConfig;
import com.anfcorp.sourcing.kafkastarter.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({KafkaProducerConfig.class, SwaggerConfig.class})
public class SpringBootHelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }
}
