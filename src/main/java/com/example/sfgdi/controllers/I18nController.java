package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 17:12
 */

@Controller
public class I18nController {

    private final GreetingService greetingService;


    public I18nController( @Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
