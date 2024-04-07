package fun.digitallpepper.logistic_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class LogisticServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticServiceApplication.class, args);
    }

}
