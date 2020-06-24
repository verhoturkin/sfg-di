package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 16:47
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
