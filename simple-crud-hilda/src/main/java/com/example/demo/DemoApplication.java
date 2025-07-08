package com.example.demo;
import com.example.demo.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
//public class DemoApplication implements CommandLineRunner { bwt request param name n age
public class DemoApplication{
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

// Notes, next for request 2 param :
// @Override
//    public void run(String... args) throws Exception {
//      System.out.println("Hello this is quickstart application!");
//    }
//
//    @GetMapping("/hello")
//    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
//                        @RequestParam(value="age",defaultValue = "0") int age) {
//      return String.format("Hello %s! You are %d years old", name,age);
//    }

        User user = new User(UUID.randomUUID(), "Hilda", "hilda@email.com");
    }
}