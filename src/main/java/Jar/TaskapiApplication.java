package Jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "Jar")
public class TaskapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskapiApplication.class, args);
    }

}