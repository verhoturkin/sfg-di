package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Alexander Verkhoturkin
 * @created 24/06/2020 - 17:03
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
