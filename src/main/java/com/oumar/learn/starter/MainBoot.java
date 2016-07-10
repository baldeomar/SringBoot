package com.oumar.learn.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainBoot {

    @RequestMapping("/")
    String main(){
        return "how high";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String home() {
        return "at home";
    }

    public static void main(String args[]) throws Exception{
        SpringApplication.run(MainBoot.class, args);
    }
}
