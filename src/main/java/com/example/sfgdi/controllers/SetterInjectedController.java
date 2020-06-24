package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 16:45
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
