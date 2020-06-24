package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 16:42
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
