package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public Greeting greeetingmessage(@RequestParam String firstname, @RequestParam String lastname){
        return new Greeting(counter.incrementAndGet(), String.format(template, firstname, lastname));
    }

}
